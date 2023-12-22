package day20_Arrays;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String[] array1 = new String[5];

        System.out.println(Arrays.toString(array1));
        array1[2] = "ali";
        System.out.println(Arrays.toString(array1));
        // array1 = null;
        System.out.println(Arrays.toString(array1));

        System.out.println("-----------------");

        String[] array2 = {"", "", ""};

        System.out.println(Arrays.toString(array2));

        array1[1] = "memoli";
        System.out.println(array1[1]);

        int[] arr;
        int[] arr2 = {0};
        arr2[1]=3;
        System.out.println(Arrays.toString(arr2));

    }
}
