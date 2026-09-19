package day24;

public class Students {
    //WAP to print the full name of the students --> firstname, middlename, lastname

    //Store the firstname, middlename, lastname ---> variables
    //printFullName                             ---> method

    String firstName;
    String middleName;
    String lastName;

    public void printFullName()
    {
        String completeName=firstName+" "+middleName +" " +lastName;
        System.out.println("Name of Student is: " + completeName);
    }





}
