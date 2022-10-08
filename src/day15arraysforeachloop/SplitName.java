package day15arraysforeachloop;

import java.util.Arrays;

public class SplitName {
    public static void main(String[] args) {
        String name="Ali Can";
       /* String[] array= name.split(" ");
        System.out.println(array[1]);

        String OneName=array[1];

        */
        System.out.println(name.split(" ")[1]);




        String name2 ="M o h a m m a d M u s t a f a";
        //split method only works with String array
        //Split into char array

        char[] array=name2.toCharArray();
        System.out.println(Arrays.toString(array));

        String[] namesChars=name2.split(" ");
        System.out.println(Arrays.toString(namesChars));
        String chars="";
        for (String each: namesChars){
            //System.out.println(each);
            chars+=each;
        }
        char[] charArray= chars.toCharArray();
        System.out.println(Arrays.toString(charArray));


        /*String name3= "I b r a h i m O s m a n";
        String[] chars2=name.split(" ");
        String cont="";
        for (int i=0;i<chars2.length;i++);{
            cont+=chars2[i];
         }
         */

    }
}
