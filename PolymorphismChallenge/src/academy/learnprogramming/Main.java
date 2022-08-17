package academy.learnprogramming;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car --> startEngine";
    }

    public String accelerate() {
        return "Car --> accelerate";
    }

    public String brake() {
        return "Car --> brake";
    }
}

class Mitsubishi extends Car {

    public Mitsubishi (int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " --> startEngine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " --> accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " --> brake";
    }
}


class Holden extends Car {

    public Holden (int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden --> startEngine";
    }

    @Override
    public String accelerate() {
        return "Holden --> accelerate";
    }

    @Override
    public String brake() {
        return "Holden --> brake";
    }
}

class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford --> startEngine";
    }

    @Override
    public String accelerate() {
        return "Ford --> accelerate";
    }

    @Override
    public String brake() {
        return "Ford --> brake";
    }
}


// =================================================================================================
// We are going back to the car analogy
// =================================================================================================
//
// (1) Create a base class called Car.
//      It should have a few fields that would be appropriate for a generic car class.
//      engine, cylinders, wheels, etc.
//
// (2) Constructor should initialize cylinders (number of) and name, and set wheels to 4
//      and engine to true.
//
// (3) Cylinders and names would be passed by parameters.
//
// (4) Create appropriate getters.
//
// (5) Create some methods like startEngine, accelerate, and brake.
//
// (6) Show a message for each in the base class.
//
// (7) Now create three sub classes for your favorite vehicles.R
//
// (8) Override the appropriate methods to demonstrate polymorphism in use.
//
// (9) Put all classes in the one java file

public class Main {
    public static void main(String[] args) {

	Car car = new Car(8, "Base car");
    System.out.println(car.startEngine());
    System.out.println(car.accelerate());
    System.out.println(car.brake());

    Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
    System.out.println(mitsubishi.startEngine());
    System.out.println(mitsubishi.accelerate());
    System.out.println(mitsubishi.brake());

    Ford ford = new Ford(6, "Ford Falcon");
    System.out.println(ford.startEngine());
    System.out.println(ford.accelerate());
    System.out.println(ford.brake());

    Holden holden = new Holden(6, "Holden Commodoro");
    System.out.println(holden.startEngine());
    System.out.println(holden.accelerate());
    System.out.println(holden.brake());

    }


}