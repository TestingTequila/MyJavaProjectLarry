package day27;

public class TestStudents
{
    static void main() {
        Students stud1= new Students();
        int marks =stud1.getStudentMarks("Ashish");
        System.out.println("Marks: " + marks);
        if(marks<0)
        {
            System.out.println("Not a student of this Batch....");
        }
    }
}
