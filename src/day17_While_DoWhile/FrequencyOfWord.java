package day17_While_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {

        /* This is my solution
        String sentence = "JavaJavaJavaJavaJavaJavaJava";
        String word ="Java";
        String str="";
        int frequency=0;

        for (int i = 0; i < sentence.length(); i++) {
            str += sentence.charAt(i);
            if (str.equals(word)){
                frequency++;
                str="";
            }
        }

        System.out.println(frequency);

         */

        String str = "JavaJavaJavaJavaJava";


        int frequency = 0;
//                              8 - 4
        for (int i = 0; i <= str.length() - 4; i++) {
            String eachSub = str.substring(i, i + 4);
            //System.out.println(eachSub);

            if (eachSub.equals("Java")) {
                frequency++;
            }

        }

        System.out.println(frequency);

    }
}

/*
2. write a program that can return the frequency of the word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3
 */