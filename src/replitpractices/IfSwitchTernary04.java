package replitpractices;

import java.util.Scanner;

public class IfSwitchTernary04 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        char response=scan.nextLine().charAt(0);

        switch (response) {
            case 'a' -> System.out.println("Your request is being processed");
            case 'b' -> System.out.println("Thank you anyway for your consideration");
            case 'c' -> System.out.println("Sorry, no help is currently available");
            default -> System.out.println("Invalid entry, please try again!");
        }


    }
}
