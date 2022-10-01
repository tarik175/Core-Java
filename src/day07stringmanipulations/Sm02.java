package day07stringmanipulations;

public class Sm02 {
    public static void main(String[] args) {

        String str="Ali Can";

        String newStr=str.concat("!");
        System.out.println(newStr);
        System.out.println(newStr);

        boolean isLast=str.endsWith("n");
        System.out.println(isLast);

        boolean isTheForth=str.startsWith("C", 4);
        System.out.println(isTheForth);
    }
}
