package solid;

public class OpenClosed {
    public static void main(String[] args) {
        CarCost car = new CarCost(2000);
        CarCost monsterTruck = new MonsterTruckCost(7000);
        CarCost passengerCar = new PassengerCarCost(3000);

        System.out.println(car.calculateCost());
        System.out.println(monsterTruck.calculateCost());
        System.out.println(passengerCar.calculateCost());



    }
}

class CarCost {
    protected int cost;

    public CarCost(int cost) {
        this.cost = cost;
    }

    public int calculateCost() {
        return cost;
    }
}

class MonsterTruckCost extends CarCost {
    private int tax = 30 ;

    public MonsterTruckCost(int cost) {
        super(cost);
    }

    @Override
    public int calculateCost() {
        return  cost + cost*tax/100;
    }
}

class PassengerCarCost extends CarCost {
    private int tax = 23 ;



    public PassengerCarCost(int cost) {
        super(cost);
    }

    @Override
    public int calculateCost() {
        return  cost + cost*tax/100;
    }
}




