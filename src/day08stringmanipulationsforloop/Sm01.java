package day08stringmanipulationsforloop;

public class Sm01 {
    public static void main(String[] args) {
        /*
        if you type code which runs for specific data it is called "Hard coding" and
        "Hard Coding" is not acceptable in coding
         */


        String str="Ali is 13 years old, I think he is 20";
        //1.Example:Remove all space character from the String
        String noSpace=str.replace(" ", "");
        System.out.println(noSpace);


        //2.Example: Change digits to *
        //1.Way:Hard Coded which is not good
        String noDigit=str.replace("13","**").replace("15","**");
        System.out.println(noDigit);

        //2.Way: Without hard coding
        //Regex is: reguler expressions
        String noDigitDynamic=str.replaceAll("[0-9]","*");
        System.out.println(noDigitDynamic);

        //3.Example: Change all letters to !
        String noLettersDynamic=str.replaceAll("[A-Za-z]","!");
        System.out.println(noLettersDynamic);

        //4.Example: Change all characters different from letters to ?
        String question=str.replaceAll("[^A-Za-z]", "?");
        System.out.println(question);

        //5.Example:Change all characters different from space to *
        //1.Way:
        String diffFromSpace=str.replaceAll("[^ ]", "*");
        System.out.println(diffFromSpace);

        /*
            1)\\s means space character
            2)\\S means characters different from space character

            3)\\d means digits
            4)\\D means different from digits

            5)\\w means A-Z and a-z and 0-9 and _
            6)\\W means different from A-Z and a-z and 0-9 and _
            7)\\p{Punct} means all punctuation marks
            8)\\A start of String, \\Z end of String
         */
        //2.Way:
        String diffFromSpace2=str.replaceAll("\\S","*");
        System.out.println(diffFromSpace2);

        //6.Example: How many characters are used in the String different from space?
        int numOfCharDiffFromSpace=str.replaceAll("\\s", "").length();
        System.out.println(numOfCharDiffFromSpace);

        //7.Example:How many letters are used in the String?
        int numOfLetters=str.replaceAll("[^A-Za-z]","").length();
        System.out.println(numOfLetters);

        //8.Example: How many punctuation marks are used in the String
        String punc=str.replaceAll("\\p{Punct}","");
        System.out.println(punc);
    }
}
