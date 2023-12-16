package day01_JavaIntro;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        StringUtility.printEachChar(str);

        for (int j = 0; j < 10; j++) {

            for (int i = 0; i < 10; i++) {

                System.out.print("*");

            }

            System.out.println();

        }



    }


}
