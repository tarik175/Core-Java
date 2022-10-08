package day15arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {
    public static void main(String[] args) {


        //Sort the array elements according to their lengths==> "Ali"- "Veli"-"Maria"- "Micheal"
        String srr[]={"Veli", "Micheal", "Ali", "Maria"};
        System.out.println(Arrays.toString(srr));
        Arrays.sort(srr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(srr));


        //Sort the array elements in descending order according to their lengths.==> "Micheal"- "Maria" - "Veli" - "Ali"
        String trr[]={"Veli", "Micheal", "Ali", "Maria"};
        Arrays.sort(trr, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(trr));

        //Sort the array elements in descending order according to their lengths.
        // If some elements are in the same length put them in alphabetical order==> "Micheal"- "Maria" - "Veli" - "Ali"
        String urr[]={"Veli", "Micheal", "Ali", "Maria", "Can", "Tan", "Ayse"};
        Arrays.sort(urr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        //naturalOrder() means alphabetical order in Strings, ascending order in numbers
        System.out.println(Arrays.toString(urr));





    }
}
