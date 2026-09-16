package day22;

import java.util.Arrays;

public class ArrayWithLoops {
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

        System.out.println("=====WhileWithMarksArray============");
        int j = 0;
        while (j < marks.length) {
            System.out.println(marks[j]);
            j++;
        }
        System.out.println("=====ForWithMarksArray============");

        for (int k = 0; k < marks.length; k++) {
            System.out.println(marks[k]);
        }

        System.out.println("=====AdvancedForLoopWithMarksArray============");
        for(int r :marks)
        {
            System.out.println(r);
        }

        System.out.println("=====DisplayMarksArray============");
        System.out.println(Arrays.toString(marks));


        System.out.println("========emp array==============");
        //Jason, Roger, Larry, Ashish, Kerrie, Lee [group of values, similar data type(String) ]

        String[] emp = {"Jason", "Roger", "Larry", "Ashish", "Kerrie", "Lee"};
        //lowestIndex = 0
        //highestIndex = 5
        System.out.println("Size of Marks emp is: " + emp.length);

        System.out.println("=====WhileWithMarksArray============");
        int l = 0;
        while (l < emp.length) {
            System.out.println(emp[l]);
            l++;
        }

        System.out.println("=====ForWithMarksArray============");

        for (int m = 0;m < emp.length;m++) {
            System.out.println(emp[m]);

        }

        System.out.println("=====AdvancedForLoopWithEmpArray============");
        for(String s :emp)
        {
            System.out.println(s);
        }

        System.out.println("=====DisplayEmpArray============");
        System.out.println(Arrays.toString(emp));


        System.out.println("==================Vowels Array============");
        //a,e,i,o,u - char {Arrays}

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        //lowestIndex = 0
        //highestIndex =4
        System.out.println("Size of vowels is: " + vowels.length);

        System.out.println("=====WhileWithVowelsArray============");
        int n = 0;
        while (n < vowels.length) {
            System.out.println(emp[n]);
            n++;
        }

        System.out.println("=====ForWithVowelsArray============");

        for (int o = 0;o < vowels.length;o++) {
            System.out.println(vowels[o]);

        }

        System.out.println("=====AdvancedForLoopWithEmpArray============");
        for(char t:vowels)
        {
            System.out.println(t);
        }

        System.out.println("=====DisplayVowelsArray============");
        System.out.println(Arrays.toString(vowels));


        System.out.println("==================Temp Array============");

        //12.34,56.78, 55.66, 34.78, 89.98, 99.16

        double[] temp = {12.34, 56.78, 55.66, 34.78, 89.98, 99.16};
        System.out.println("Size of temp is: " + temp.length);
        //lowestIndex = 0
        //highestIndex = 5
        System.out.println("=====WhileWithTempArray============");
        int p = 0;
        while (p < temp.length) {
            System.out.println(emp[p]);
            p++;
        }

        System.out.println("=====ForWithTempArray============");

        for (int q = 0;q < temp.length;q++) {
            System.out.println(temp[q]);

        }
        System.out.println("=====AdvancedForLoopWithTempArray============");
        for(double u :temp)
        {
            System.out.println(u);
        }

        System.out.println("=====DisplayTempArray============");
        System.out.println(Arrays.toString(temp));

        System.out.println("==================Tabs Array============");

        //Home, Gift Certificates, Brands, Blogs, Contact Us

        String[] tabs={"Home", "Gift Certificates", "Brands", "Blogs", "Contact Us"};



    }
}
