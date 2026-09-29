package day31;

public class TestTraining {
    static void main() {
        Training t1 = new Training();
        t1.fName = "Joseph";
        t1.batchNumber = 44;
        t1.feeAmount = 3456.78;

        System.out.println("==============before  assigning parameters value to Global Variable======");

        System.out.println(t1.fName); //Joseph
        System.out.println(t1.batchNumber);//44
        System.out.println(t1.feeAmount);//3456.78



        System.out.println("==============after assigning parameters value to Global Variable======");
        t1.studentDetails("Kerrie", 67, 6543.21);

        System.out.println(t1.fName); //Kerrie
        System.out.println(t1.batchNumber);//67
        System.out.println(t1.feeAmount);//6543.21

    }
}
