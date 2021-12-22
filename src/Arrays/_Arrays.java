package Arrays;

import java.util.Arrays;

public class _Arrays {
    public static void main(String[] args) {
        //Integer Array mit einer größe von 6 wird deklariert
        int[] testArray_1 = new int[6];

        //Das Array wird mit Werten gefüllt
        testArray_1[0] = 5;
        testArray_1[1] = 7;
        testArray_1[2] = 8;
        testArray_1[3] = 2;
        testArray_1[4] = 3;
        testArray_1[5] = 9;

        //Es wird noch ein Integer Array mit 5 Werten deklariert
        int[] testArray_2 = {3, 4, 2, 1, 0};

        //Größe von Arrays bekommt man mit der "length" Eigenschaft
        //int arr1Length = testArray_1.length;
        //int arr2Length = testArray_2.length;

        //Die Arrays werden mit der "sort" Methode aufsteigend sortiert
        Arrays.sort(testArray_1);
        Arrays.sort(testArray_2);

        //Array-Elemente werden zeilenweise auf der Konsole ausgegeben
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
