package day29;

public class ExecuteGraduate
{
    static void main() {
        Graduate student1 = new Graduate();
        student1.name = "Jason";
        student1.city = "NY";
        student1.age =23;

        System.out.println("Name: " + student1.name + ", City: " + student1.city + ", Age: " + student1.age + ", College: " + Graduate.collegeName);
    }
}
