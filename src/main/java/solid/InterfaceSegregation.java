package solid;

public class InterfaceSegregation {
    public static void main(String[] args) {
        Wheels wheels = new Wheels();
        Engine engine = new Engine();

        wheels.work();
        wheels.stopTurning();

        engine.work();
    }
}

interface PersonOptions extends RelaxOptions, WorkOptions {
}

interface RelaxOptions {
    void stopTurning();
}

interface WorkOptions {
    void work();
}

class Wheels implements PersonOptions {

    @Override
    public void stopTurning() {
        System.out.println("Wheels stop turning");
    }

    @Override
    public void work() {
        System.out.println("Wheals are turning");
    }
}

class Engine implements WorkOptions {

    @Override
    public void work() {
        System.out.println("Engine is working");
    }
}

