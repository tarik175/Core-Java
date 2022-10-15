package objectmanipulations;

import java.util.Scanner;

public class MainRunner3 {
    /*
    Ask user their name and lastname
    Then generate an email for them
    concatenate first name and last name
    and "gmail.com" then print email for the user on the console
     */


    public static void main(String[] args) {
        //Person person=new Person();
        Scanner scan=new Scanner(System.in);


        System.out.println("Please type your name and lastname");

        Person person=new Person(scan.next(),scan.next());

        generateEmail(person);








    }
    //primitives //Objects
    public static void generateEmail(Person person){
        System.out.println((person.name+person.lastname+"@gmail.com").toLowerCase());

    }


}
