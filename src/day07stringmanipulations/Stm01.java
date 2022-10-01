package day07stringmanipulations;

import java.util.Scanner;

public class Stm01 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a String...");
        String str=scan.nextLine();
        // Print the first and last character of the given String on the console. "Java is easy"==>Jy
        //To get characters from a String one by one we have 2 ways;
        //1.Way: Using charAt();
        char firstChar= str.charAt(0);
        System.out.println(firstChar);
        char lastChar= str.charAt(str.length()-1);
        System.out.println(lastChar);

                //2.Way: Using substring()
        //To get first character from a String by using substring() methods use str.substring(0,1);
        String firstCharacter= str.substring(0,1);
        System.out.println(firstCharacter);
        String lastCharacter= str.substring(str.length()-1);
        System.out.println(lastCharacter);

        //2.Example: Type code to get initials of the first name and the last name of a given name. Ali Can ==> AC, Mary Star ==> MS etc.
        String initialsOfFirstName= str.substring(0,1);

        //How to find index of space character
        int indexOfInitialOfLastName=str.indexOf(" ")+ 1;
        String initialsOfLastName=str.substring(indexOfInitialOfLastName, indexOfInitialOfLastName+1);
        System.out.println(initialsOfFirstName + initialsOfLastName);

        //3.Example: Check if any character exists in a String or not
        String characterToCheck= "Can";
        int result= str.indexOf(characterToCheck);
        if(result==-1){
            System.out.println("The character does not exist");
        }else{
            System.out.println("The character exists");
        }

        //2.Way:
        //Java created contains() a method to check if a specific character or characters exist in a String or not
        boolean isContain = str.contains("x");
        if (isContain){
            System.out.println("The character exists");
        }else{
            System.out.println("The character does not exist");
        }
    }
}
