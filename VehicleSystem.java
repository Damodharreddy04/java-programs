class Vehicle {
    public void displayType() {
        System.out.println("This is a vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    public void displayType() {
        System.out.println("This is a car.");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.displayType();
        Vehicle car = new Car();
        car.displayType();
    }
}