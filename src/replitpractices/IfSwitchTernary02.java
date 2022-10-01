package replitpractices;

import java.util.Scanner;

public class IfSwitchTernary02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String name=scan.nextLine();
        String lastname=scan.nextLine();

        String cc=scan.nextLine();

        name=name.toUpperCase().charAt(0)+name.substring(1).replaceAll("\\w","*");
        lastname=lastname.toUpperCase().charAt(0)+lastname.substring(1).replaceAll("\\w","*");
        cc=cc.substring(0,12).replaceAll("\\d","*")+cc.substring(12);
        System.out.println(cc);
        System.out.println(name);
        System.out.println(lastname);

        if (cc.length() != 16){
            System.out.println("invalid credit card number");
        }













    }
}
