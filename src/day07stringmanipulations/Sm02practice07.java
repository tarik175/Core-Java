package day07stringmanipulations;

import java.util.Scanner;

public class Sm02practice07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your password");
        String password=sc.nextLine();
        if(password.charAt(0)!=password.toUpperCase().charAt(0)){
            System.out.println("invalid");
        }if(password.charAt(password.length()-1)!=password.toLowerCase().charAt(password.length()-1)){
            System.out.println("invalid");
        }if(password.length()!=6){
            System.out.println("invalid");
        }
    }
}
