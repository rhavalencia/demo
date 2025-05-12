package oop.abstraction;

public abstract class Car {
    private String brand;
    private String model;
    private String color;
    private int speed;

    //method Overloadin ex. Car(): default and parameterized
    public Car() {
    }
    public Car(String brand, String model, String color, int speed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }


    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
    }

    //can overload by adding parameter duration
    
    public void accelerate(int increase) {
        speed += increase;
        System.out.println("Current speed: " + speed);
    }

    // Abstract method (must be implemented by subclasses)
    public abstract void startCar();


    public void decelerate(int decrease) {
        speed -= decrease;
        System.out.println("Current speed: " + speed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String toString(){
        return "Brand: " + getBrand()
        + " Model: " + getModel() + " Color: " 
        + getColor() + " Speed: " + getSpeed();
    }
}