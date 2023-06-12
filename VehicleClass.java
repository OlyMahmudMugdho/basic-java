class VehicleClass {
    public static void main(String[] args) {
        Bike car = new Bike("R15",2);
        car.displayProperties();

        TR_110M Falcon = new TR_110M();
        
        Falcon.setHealth(100);
        Falcon.checkHealth();
    }
}

abstract class Vehicle{
    protected String name;
    protected int wheels;

    public void turnOn(){
        System.out.println(name + "Engine starting...\n ..Started");
    }

    public void displayProperties(){
        System.out.println("name : " + name + "\nwheels : " + wheels);
    }

    public void setVehicle(String name, int wheels){
        this.name = name;
        this.wheels = wheels;
    }
}

class Bike extends Vehicle {

    Bike(String name, int wheels){
        this.name = name;
        this.wheels = wheels;
    }
}

interface Transformer {
    
}

class TR_110M implements Transformer {
    private double health;

    public void run(){
        System.out.print("Running treansformer...");
    }

    public void setHealth(double power) {
        health = power;
    }

    public void checkHealth() {
        System.out.println("Health of the Transformer : " + health + "%");;
    }
}