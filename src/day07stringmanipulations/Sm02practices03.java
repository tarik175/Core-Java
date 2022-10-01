package day07stringmanipulations;

import java.util.Scanner;

public class Sm02practices03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a letter:");
        String letter=sc.nextLine();
        if(letter.toUpperCase().equals(letter)){
            if(letter.charAt(0)<'F'){
                System.out.println("Big before F");
            }else if (letter.charAt(0)>'F'){
                System.out.println("Big after F");
            }
        }else{
            if(letter.charAt(0)<'h'){
                System.out.println("Small before h");
            }else if(letter.charAt(0)>'h'){
                System.out.println("Small after h");
            }
        }
        String print= (letter.toUpperCase().equals(letter) ? (letter.charAt(0)<'F' ? "Big before F": "Big after F") : (letter.charAt(0)>'h' ? "Small after h": "Small before h"));
        System.out.println(print);
    }
}
