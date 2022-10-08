package day15arraysforeachloop;

import java.util.Arrays;

public class SplitArray {

    public static void main(String[] args) {


        String words = "I go to school";
        //we use split method, to split the words or items of a String
        //When we use split method, we can use any char to split the given String

        String[] arrayWords= words.split(" ");
        System.out.println(Arrays.toString(arrayWords));

        String words2="I,go,to,school";
        String[]arrayWords2=words2.split(",");
        System.out.println(Arrays.toString(arrayWords2));

        String name="Ibrahim#Settar#Filiz#Kerem";
        String[] names=name.split("#");
        System.out.println(Arrays.toString(names));

        String sentence="I have 2 pets and one car";
        String[] array= sentence.split("and");
        System.out.println(Arrays.toString(array));


    }

}
