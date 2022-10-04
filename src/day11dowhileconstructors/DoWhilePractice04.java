package day11dowhileconstructors;

import java.util.Scanner;

public class DoWhilePractice04 {
    public static void main(String[] args) {
        int num=1;
        do {
            System.out.println(num);
            num++;
        }while (num<6);

        System.out.println("====================");

        int num2=10;
        do {
            System.out.println(num2);
            num2--;
        }while (num2>2);

        System.out.println("====================");

        int num3=1;
        do {
            if (num3%5==0) {
                System.out.println(num3);
            }
            num3++;
        }while (num3<101);

        System.out.println("===================");
        char k='c';
        do {
            System.out.println(k);
            ++k;
        }while (k<'n');

        System.out.println("=============================");
        Scanner sc=new Scanner(System.in);
        String name="";
        do {
            name=sc.next();
            if (name.contains("a")){
                System.out.println("Won!");
            }
        }while (!name.contains("a"));

        System.out.println("===================");

        String word="Germany";
        int i=0;
        do {

            if (word.indexOf(word.charAt(i))%2!=0){
                System.out.println(word.charAt(i));
            }
            i++;
        }while (i<word.length());






    }
}
