package solid;

public class DependencyInversion {
    public static void main(String[] args) {
        Switchable leftSignal = new LeftTurnSignal();
        Switchable rightSignal = new RightTurnSignal();

        TurnSignalSwitch left = new TurnSignalSwitch(leftSignal);
        TurnSignalSwitch right = new TurnSignalSwitch(rightSignal);

        left.turnOn();
        left.turnOff();
        right.turnOn();
        right.turnOff();

    }
}

// Abstraction
interface Switchable {
    void turnOn();

    void turnOff();
}

// Low-level class
class LeftTurnSignal implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Left turn signal is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Left turn signal is off");
    }
}

// Low-level class
class RightTurnSignal implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Right turn signal is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Right turn signal is off");
    }
}

// High-level class
class TurnSignalSwitch {
    private Switchable device;

    public TurnSignalSwitch(Switchable device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }
}


