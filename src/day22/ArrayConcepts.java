package day22;

public class ArrayConcepts {
    static void main() {
        //10
        int x = 10;
        System.out.println(x);//10

        // 89, 65,43,76,87,12,4,3 [group of values of similar data type]

        int a = 89;
        int b = 65;
        int c = 43;
        int d = 76;
        int f = 87;
        int g = 12;
        int h = 4;
        int i = 3;

        System.out.println("=================marks Array===============");

        //dataType[] arrayName ={value1, value2, value3, value4.......valueN};
        int[] marks = {89, 65, 43, 76, 87, 12, 4, 3};
        System.out.println("Size of Marks Array is: " + marks.length);
        //lowestIndex = 0
        //highestIndex = 7
        System.out.println(marks[0]);//89
        System.out.println(marks[2]);//43
        System.out.println(marks[3]);//76
        System.out.println(marks[4]);//87
        System.out.println(marks[5]);//12
        System.out.println(marks[6]);//4
        System.out.println(marks[7]);//3

        System.out.println("========emp array==============");
        //Jason, Roger, Larry, Ashish, Kerrie, Lee [group of values, similar data type(String) ]

        String[] emp = {"Jason", "Roger", "Larry", "Ashish", "Kerrie", "Lee"};
        //lowestIndex = 0
        //highestIndex = 5
        System.out.println("Size of Marks emp is: " + emp.length);

        System.out.println(emp[0]);//Jason
        System.out.println(emp[1]);//Roger
        System.out.println(emp[2]);//Larry
        System.out.println(emp[3]);//Ashish
        System.out.println(emp[4]);//Kerrie
        System.out.println(emp[5]);//Lee

        System.out.println("==================Vowels Array============");
        //a,e,i,o,u - char {Arrays}

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        //lowestIndex = 0
        //highestIndex =4
        System.out.println("Size of vowels is: " + vowels.length);
        System.out.println(vowels[0]);//a
        System.out.println(vowels[1]);//e
        System.out.println(vowels[2]);//i
        System.out.println(vowels[3]);//o
        System.out.println(vowels[4]);//u

        System.out.println("==================Temp Array============");

        //12.34,56.78, 55.66, 34.78, 89.98, 99.16

        double[] temp = {12.34, 56.78, 55.66, 34.78, 89.98, 99.16};
        System.out.println("Size of temp is: " + temp.length);
        //lowestIndex = 0
        //highestIndex = 5

        System.out.println(temp[0]);//12.34
        System.out.println(temp[1]);//56.78
        System.out.println(temp[2]);//55.66
        System.out.println(temp[3]);//34.78
        System.out.println(temp[4]);//89.98
        System.out.println(temp[5]);//99.16


    }
}
