package day15arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {


    public static void main(String[] args) {
        //Check if the array elements are in the natural order. "A", "B", "C"==> true - "A", "C" , "B" ==> false
        String srr[]={"Ayhan", "Beyhan", "Ceyhan"};
        System.out.println(Arrays.toString(srr));

        //Create a new array and put the elements into the new array
        String trr[]=new String[3];
        //If you want to keep the original array same, transfer the elements one by one
        //By using copyOf() method you will have same elements in 2 different reserved area
        for (int i=0; i<3;i++){
            trr[i]=srr[i];
        }
        System.out.println(Arrays.toString(trr));

        Arrays.sort(trr);
        System.out.println(Arrays.toString(trr));

        if (Arrays.equals(srr, trr)){
            System.out.println("In natural order");
        }else {
            System.out.println("Not in natural order");
        }


        //Correct Solution 2
        String mrr[]={"Ayhan", "Beyhan", "Ceyhan"};
        System.out.println(Arrays.toString(srr));
        //If you want to keep original array same, use the copyOf() method
        //By using copyOf() method you will have same elements in 2 different reserved area
        String nrr[]=Arrays.copyOf(mrr,3);
        Arrays.sort(nrr);
        if (Arrays.equals(mrr, nrr)){
            System.out.println("In natural order");
        }else {
            System.out.println("Not in natural order");
        }









        //WRONG SOLUTION
        String urr[]={"Ayhan", "Ceyhan","Beyhan"};
        System.out.println(Arrays.toString(urr));
        //If you assign an array into another array they will use same reserved area, do not forget!!!!!
        String prr[]=urr;
        Arrays.sort(prr);
        if (Arrays.equals(urr, prr)){
            System.out.println("In natural order");
        }else {
            System.out.println("Not in natural order");
        }




    }

}
