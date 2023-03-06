public class Car {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Engine is started!");
    }

    private static void startElectricity() {
        System.out.println("Electricity is started.");
    }

    private static void startCommand() {
        System.out.println("Command is started.");
    }

    private static void startFuelSystem() {
        System.out.println("Fuel System is started.");
    }
}
