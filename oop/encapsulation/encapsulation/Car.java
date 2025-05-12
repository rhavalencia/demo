package encapsulation;
public class Car {
    private String brand;
    private String model;
    private String color;
    private int speed;

    public Car(String brand, String model, String color, int speed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public Car() {
    }

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

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

}