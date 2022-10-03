package day10forloopwhileloop;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {

        //1.Example: Type code to find the sum of the integers from 12 to 231
        int sum=0;
        for (int i=12; i<232 ; i++){
            sum+=i;
        }
        //Note: If you put System.out.println(sum); inside the loop you will see the sum value for every loop.
        //      If you expect to see the sum value for every loop put it inside the loop, if you want to see the final sum value put it outside

        System.out.println(sum);

        //2.Example: Type code to find the multiplication of the integers from 3 to 5
        int prod=1;         //there was no particular reason to name this int "prod". Don't think about it.(note to self:you wrote this)
        for (int i=3;i<6;i++){
            prod*=i;
        }
        System.out.println(prod);

        //3.Example: Type code to check if a given String is Polidrome.
        //    String: anna Reversed String: anna


        String s= "anna";
        String reversedS="";
        //Find the reverse
        for (int i=s.length()-1; i>-1;i--){
            reversedS= reversedS+s.charAt(i);
        }
        System.out.println(reversedS);
        //4.Example: Type code to check if a given Integer is Polidrome.
        //    Integer:12321 Reversed Integer: 12321
        int num= 12321;
        String reversedNum="";
        String stringFromNum= String.valueOf(num);
        for (int i=stringFromNum.length()-1;i>-1;i--){
            reversedNum=reversedNum+stringFromNum.charAt(i);

            //use if statements to check index and lastindex
        }
        System.out.println(reversedNum);


        //5.Example: Type code to find the sum of the digits of an integer
        int n=753;
        int sumOfDigits=0;
        for (int i=n;i>0;i=i/10){
            sumOfDigits=sumOfDigits+i%10;
        }
        System.out.println(sumOfDigits);


        //6.Example: Type code to find the sum of unique digits of an integer.
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer");
        int p= scan.nextInt();


        String pS=String.valueOf(p);

        int sumOfUniqueDigits=0;

        for (int i=0; i<pS.length();i++){

            String c=pS.substring(i,i+1);//you can use .charAt too

            if (pS.indexOf(c)==pS.lastIndexOf(c)){


                sumOfUniqueDigits=sumOfUniqueDigits+Integer.valueOf(c+"");

            }


        }
        System.out.println(sumOfUniqueDigits);





    }
}
