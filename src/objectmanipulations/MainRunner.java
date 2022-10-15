package objectmanipulations;

import java.util.Scanner;

public class MainRunner {
    public static void main(String[] args) {
        /*
        Type a program that asks user their name and lastname, then create an email for the user
        concatenate the name and lastname then add @gmail.com
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("Type your name and last name");

        String name=scan.nextLine();
        String lastname=scan.nextLine();

        System.out.println("person name: " + name);
        System.out.println("person lastname: " + lastname);

        System.out.println(getEmail(name,lastname));



    }
    public static String getEmail(String name,String lastname){
        return (name+lastname+"@gmail.com").toLowerCase();
    }


}
