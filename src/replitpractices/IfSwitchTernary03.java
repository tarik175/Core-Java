package replitpractices;

import java.util.Scanner;

public class IfSwitchTernary03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        long num1=sc.nextLong();
        long num2=sc.nextLong();
        long sum=num1+num2;

        if (num1<0||num2<0){
            System.out.println("invalid");
        }

        if (Float.toString(num1).length()>10||Float.toString(num2).length()>10){
            System.out.println("invalid");
        }
        System.out.println(sum);




    }
}
