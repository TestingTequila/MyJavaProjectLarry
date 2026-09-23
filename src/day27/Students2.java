package day27;

public class Students2
{
    public int getStudentMarks(String studentName)
    {
        int marks = -1;

        if(studentName.equals("Kerrie"))
        {
            marks= 67;
        }
        else if (studentName.equals("Larry"))
        {
            marks= 78;
        }
        else if (studentName.equals("John"))
        {
            marks= 43;
        }
        else if (studentName.equals("Lee"))
        {
            marks= 53;
        }
        else if (studentName.equals("Jason"))
        {
            marks= 88;
        }
        return marks;
    }
}
