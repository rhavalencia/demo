package oop.polymorphism;

public class SportsCar extends Car{
    private boolean turboEnabled;

    public SportsCar(String brand, String model, String color, int speed) {
        super(brand, model, color, speed);
        this.turboEnabled = false;
    }

    public void enableTurbo() {
        turboEnabled = true;
        System.out.println("Turbo mode activated!");
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Turbo Enabled: " + (turboEnabled ? "Yes":"No"));
    }

    @Override
    public String toString(){
       return "Brand: " + getBrand()
        + " Model: " + getModel() + " Color: " 
        + getColor() + " Speed: " + getSpeed() + " Turbo Enabled: "+ (turboEnabled ? "Yes":"No");
    }
}
