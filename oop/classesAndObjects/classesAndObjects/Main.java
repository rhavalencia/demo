package classesAndObjects;
public class Main{
    public static void main(String[] args){
        Car carObj = new Car();

        carObj.brand = "Toyota";
        carObj.model = "Corolla";
        carObj.color = "Red";
        carObj.speed = 0;

        carObj.displayDetails();
        carObj.accelerate(20);
        carObj.decelerate(10);
    }
}