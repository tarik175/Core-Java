package day07stringmanipulations;

import java.util.Scanner;

public class Sm02practice04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your first and last time");
        String name=sc.nextLine();
        int space= name.indexOf(" ");
        String firstName= name.substring(0,space);
        String lastName= name.substring(space+1);
        System.out.println(firstName);
        System.out.println(lastName);
    }
}
