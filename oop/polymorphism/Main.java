package oop.polymorphism;
public class Main{
    public static void main(String[] args){
        
        // Default Constructor
        // Car carObj = new Car();
        // carObj.brand = "Toyota";
        // carObj.setBrand("Toyota");
        // System.out.println(carObj.getBrand());
        // carObj.model = "Corolla";
        // carObj.color = "Red";
        // carObj.speed = 0;

        //For parameterized constructor
        // Car carObj = new Car("Toyota","Corolla","Red", 0);
        // carObj.displayDetails();

        SportsCar sportsCar = new SportsCar("Ferrari","488 GTB","Rosso Corsa",100);
        //sportsCar.enableTurbo();
        sportsCar.displayDetails();
        System.out.println(sportsCar.toString());
    }
}