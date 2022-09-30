package day01variables;

import java.util.Scanner;

public class Variables01  {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        String num2 = num%2==0 ? "even": "odd";
        System.out.println(num2);
    }
}
