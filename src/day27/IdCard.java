package day27;

public class IdCard
{
    // MEDMA --> Larry Means ---> Larry MEDMA,
    //       --> Ashish Mishra ---> AShish MEDMA

    public  String name(String fName, String lName)
    {
        String fullName =fName+lName;
        System.out.println("Full Name of Employee is: " + fullName);
        return fName;
    }

}
