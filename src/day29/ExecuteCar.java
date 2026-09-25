package day29;

public class ExecuteCar {
    static void main() {
        Car c1 = new Car();
        c1.name = "BMW";
        c1.price = 6000;
        c1.color = "Red";
        System.out.println("Car Name: " + c1.name + " ,Car Price: " + c1.price +" ,Car Color: " + c1.color + " ,Car Wheels: "+ Car.wheels);
        c1.start();
        Car.stop();

        Car c2 = new Car();
        c2.name = "Audi";
        c2.price = 7000;
        c2.color = "White";
        System.out.println("Car Name: " + c2.name + " ,Car Price:" + c2.price +" ,Car Color: " + c2.color + " ,Car Wheels: "+ Car.wheels);
        c2.start();
        Car.stop();


        Car c3 = new Car();
        c3.name = "Honda";
        c3.price = 8000;
        c3.color = "Black";
        System.out.println("Car Name: " + c3.name + " ,Car Price: " + c3.price +" ,Car Color: " + c3.color + " ,Car Wheels: "+ Car.wheels);
        c3.start();
        Car.stop();


    }
}
