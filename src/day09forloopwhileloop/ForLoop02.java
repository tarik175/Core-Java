package day09forloopwhileloop;

public class ForLoop02 {
    public static void main(String[] args) {
        //1.Example:Put * between 2 consecutive characters and to the end in a String. For example; Java==> J*a*v*a*

        String s="Java";

        for (int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+ "*");
        }
        //2.Example: Type code to print unique characters in a String. Hello=> Heo
        String t="Hello";

        for(int i=0;i<t.length();i+=1){
            if(t.indexOf(t.charAt(i))== t.lastIndexOf(t.charAt(i))){

                System.out.print(t.charAt(i));
            }

        }


        //3.Example: Type code to print a String in reverse after removing spaces. For example; "Ali Can" ==> "naCilA"
        String u="Ali Can";
        String noSpace=u.replace(" ", "");
        for (int i=noSpace.length()-1;i>-1;i--){

            System.out.print(noSpace.charAt(i));

        }






    }
}
