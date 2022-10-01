package replitpractices;

import java.util.Scanner;

public class IfSwitchTernary06 {
    /*
    Ask user to type a name,
    the length of name should be 3.
    Then check if the name has same characters.
    If the String has same characters
    Print “String has duplicate characters”
    Else
    Print “String has unique characters”
    Please use ternary.
    Input :
    ala
    OutPut:
    String has duplicate characters

     */

    public static void main(String[] args) {
        String inp="ala";
        for (int i = 0; i < inp.length()-1; i++) {
            for (int j = i+1; j <inp.length() ; j++) {
                if (inp.charAt(i) == inp.charAt(j)){
                    System.out.println(inp.charAt(i)+ " is duplicate");
                }else
                    System.out.println(inp.charAt(i)+ " is unique");

            }
        }





    }
}
