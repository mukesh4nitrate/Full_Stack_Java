package DAY17;

class Vehicle {
    void startEngine() {
        System.out.println("Vehicle engine started....");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Driving the car....");
    }
}

class ElectricCar extends Car {
    void chargingBattery() {
        System.out.println("Electric car is charging....");
    }
}

class Bike extends Vehicle {
    void kickStart() {
        System.out.println("Bike is self started....");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.drive();

        ElectricCar electricCar = new ElectricCar();
        electricCar.startEngine(); // inherited from Vehicle
        electricCar.drive();       // inherited from Car
        electricCar.chargingBattery();

        System.out.println();

        Bike bike = new Bike();
        bike.startEngine();
        bike.kickStart();
    }
}
