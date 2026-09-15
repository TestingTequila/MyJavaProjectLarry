package day21;

public class RealTimeExample
{
    static void main() {

        String emailId = "jason.roger1234@janbask.com";
        String password = "test@1234";

        if(emailId.equals("jason.roger@janbask.com"))
        {
            System.out.println("Email is Valid");

            if(password.equals("test@1234"))
            {
                System.out.println("Password is Valid....");
                System.out.println("Login is allowed.....");
            }
        }
        else
        {
            System.out.println("Credentials are incorrect...Login not Allowed...");
        }


    }
}
