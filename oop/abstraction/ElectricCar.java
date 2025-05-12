package oop.abstraction;

public class ElectricCar implements Vehicle{
    int odometerReading = 30000;
    @Override
    public void start() {
        System.out.println("Electric Car starts silently.");

    }

    @Override
    public void stop() {
        System.out.println("Electric Car has powered down.");
    }
    
}
