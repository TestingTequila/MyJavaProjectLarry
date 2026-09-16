package day22;

import java.util.Arrays;

public class ArrayLimitations {
    static void main() {
        System.out.println("=================marks Array===============");

        //dataType[] arrayName ={value1, value2, value3, value4.......valueN};
        int[] marks = {89, 65, 43, 76, 87, 12, 4, 3};
        System.out.println("Size of Marks Array is: " + marks.length);
        //lowestIndex = 0
        //highestIndex = 7

        System.out.println(marks[0]);//89
        System.out.println(marks[7]);//3
        System.out.println(marks[8]);//AIOBException

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

    }
}
