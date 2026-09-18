package day23;

public class ExecuteAutomobile {
    static void main() {
        //NameOfTheCLassWhoseCopyYouWantToCreate nameOfCopy = new NameOfTheClassWhoseCopyYouWantToCreate();
        Automobile car1 = new Automobile();
        car1.manufacturesName = "AlphaRomeo";
        car1.carNumber = 12345;
        car1.color = "Blue";
        car1.isAutomatic = false;

        System.out.println("Manufactures Name: "+car1.manufacturesName);
        System.out.println("Car Number: "+car1.carNumber);
        System.out.println("Car Color: "+car1.color);
        System.out.println("Is Automatic: "+car1.isAutomatic);

        System.out.println("=========================");

        Automobile truck = new Automobile();
        truck.manufacturesName = "Mercedes";
        truck.carNumber = 54321;
        truck.color = "Black";
        truck.isAutomatic = true;

        System.out.println("Manufactures Name: "+truck.manufacturesName);
        System.out.println("Truck Number: "+truck.carNumber);
        System.out.println("Truck Color: "+truck.color);
        System.out.println("Is Automatic: "+truck.isAutomatic);

        System.out.println("=========================");
        Automobile bicycle = new Automobile();
        bicycle.manufacturesName = "Atlas";
        bicycle.color = "White";
        bicycle.carNumber = 6789;
        bicycle.isAutomatic = false;

        System.out.println("Manufactures Name: "+bicycle.manufacturesName);
        System.out.println("Bicycle Number: "+bicycle.carNumber);
        System.out.println("Bicycle Color: "+bicycle.color);
        System.out.println("Is Automatic: "+bicycle.isAutomatic);

    }
}
