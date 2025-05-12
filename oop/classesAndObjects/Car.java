public class Car {
    String brand;
    String model;
    String color;
    int speed;

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
    }

    public void accelerate(int increase) {
        speed += increase;
        System.out.println("Current speed: " + speed);
    }

    public void decelerate(int decrease) {
        speed -= decrease;
        System.out.println("Current speed: " + speed);
    }

}