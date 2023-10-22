package solid;

public class LiskovSubstitution {
    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck();
        OldCar oldCar = new OldCar();

        handler(car);
        handler(truck);
        handler(oldCar);
    }

    public static void handler(Car car){
        car.drive();
    }
}


class Car {
    void drive() {
        System.out.println("Car is driving");
    }
}

class Truck extends Car {
    // Перевизначення методу drive
    @Override
    void drive() {
        System.out.println("Truck is driving");
    }
}

class OldCar extends Car {
    // Перевизначення методу drive
    @Override
    void drive() {
        System.out.println("Old car can not drive");
    }
}


// Всі підкласи повинні зберігати контракти (інтерфейси або абстрактні класи) базового класу.
// - Це означає, що вони повинні реалізовувати всі методи і властивості, які визначені в базовому класі.
// - Підкласи можуть розширювати функціональність базового класу, але не повинні змінювати поведінку методів базового класу.
// - Якщо код працює з базовим класом, то він також має працювати з будь-яким підкласом, не втрачаючи коректності і правильності.
//
// У цьому прикладі Truck та OldCar є підкласами Car. Вони перевизначають метод drive, але при цьому зберігають
// контракт базового класу. Код, який працює з об'єктами типу Car, може також працювати з Truck і OldCar без втрати коректності.
// Принцип підстановки Ліскова сприяє розширенню системи класів та її підтримці в майбутньому, оскільки нові підкласи можна
// додавати без необхідності змінювати існуючий код.
