package day07stringmanipulations;

import java.util.Scanner;

public class Sm02practice08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your First name last name and SSN");
        String first=sc.nextLine();
        String last=sc.nextLine();
        String ssn=sc.nextLine();
        String newFirst=first.substring(0,1).toUpperCase()+first.substring(1);
        String newLast=last.substring(0,1).toUpperCase()+last.substring(1);
        String newSsn="****"+ssn.substring(4);
        System.out.println(newFirst+" "+newLast+" "+newSsn);
    }
}
