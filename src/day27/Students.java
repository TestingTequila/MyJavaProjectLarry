package day27;

public class Students
{
    public int getStudentMarks(String studentName)
    {
        if(studentName.equals("Kerrie"))
        {
            return 67;
        }
        else if (studentName.equals("Larry"))
        {
            return 78;
        }
        else if (studentName.equals("John"))
        {
            return 43;
        }
        else if (studentName.equals("Lee"))
        {
            return 53;
        }
        else if (studentName.equals("Jason"))
        {
            return 88;
        }
        return -1;
    }
}
