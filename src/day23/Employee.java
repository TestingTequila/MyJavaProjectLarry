package day23;

public class Employee {
    static void main() {
        //NameOfTheCLassWhoseCopyYouWantToCreate nameOfCopy = new NameOfTheClassWhoseCopyYouWantToCreate();

        ResumeTemplate emp1 = new ResumeTemplate();
        emp1.firstName = "Kerrie";
        emp1.lastName = "Wright";
        emp1.age = 27;
        emp1.gender = 'F';
        emp1.isMarried = false;

        System.out.println(emp1.firstName + ", " + emp1.lastName + ", " + emp1.gender + ", " + emp1.age + ", " + emp1.isMarried);

        System.out.println("=======================================");

        ResumeTemplate emp2 = new ResumeTemplate();
        emp2.firstName = "Larry";
        emp2.lastName = "Means";
        emp2.age = 38;
        emp2.gender = 'M';
        emp2.isMarried = true;

        System.out.println(emp2.firstName + ", " + emp2.lastName + ", " + emp2.gender + ", " + emp2.age + ", " + emp2.isMarried);
        System.out.println("=======================================");
        ResumeTemplate emp3 = new ResumeTemplate();
        emp3.firstName = "John";
        emp3.lastName = "Dawson";
        emp3.age = 57;
        emp3.gender = 'M';
        emp3.isMarried = false;

        System.out.println(emp3.firstName + ", " + emp3.lastName + ", " + emp3.gender + ", " + emp3.age + ", " + emp3.isMarried);

        //emp3 = null; // NPE

        //System.out.println(emp3.firstName + ", " + emp3.lastName+", "+ emp3.gender+", "+ emp3.age+ ", "+ emp3.isMarried );

        // new ClassName();
        new ResumeTemplate().firstName = "Mia";
        new ResumeTemplate().lastName = "Joseph";
        new ResumeTemplate().age = 45;
        new ResumeTemplate().gender = 'M';
        new ResumeTemplate().isMarried = true;
        System.gc();
    }
}
