package Arrays;

import java.util.Arrays;

public class _Arrays {
    public static void main(String[] args) {
        int[] testArray_1 = new int[6];
        testArray_1[0] = 5;
        testArray_1[1] = 7;
        testArray_1[2] = 8;
        testArray_1[3] = 2;
        testArray_1[4] = 3;
        testArray_1[5] = 9;

        int[] testArray_2 = {3, 4, 2, 1, 0};

        //Größe von Arrays bekommt man mit der length Eigenschaft
        //int arr1Length = testArray_1.length;
        //int arr2Length = testArray_2.length;

        Arrays.sort(testArray_1);
        Arrays.sort(testArray_2);

        System.out.println("Array_1:");
        for (int i : testArray_1) {
            System.out.println(i);
        }

        System.out.println("\nArray_2:");
        for (int i : testArray_2) {
            System.out.println(i);
        }
    }
}
