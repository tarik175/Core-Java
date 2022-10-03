package day10forloopwhileloop;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        int num=1;
        while (num<6){
            System.out.println(num);
            num++;
        }
        System.out.println("====================");
        int cons=1;
        while(cons<31){
            if (cons%2!=0){
                System.out.println(cons);
            }cons++;
        }
        System.out.println("=========================");
        Scanner sc=new Scanner(System.in);
        int nume=3;
        int multi=1;
        while (multi<11){
            System.out.println(nume+"x"+multi+"="+nume*multi);
            multi++;
        }/*
        int input=sc.nextInt();
        int fact=1;
        int i=1;
        while (i<input+1){
            fact= fact*i;
            i++;
        }
        System.out.println(fact);


        int x, k = 1;

        System.out.println("-----Enter the positive integer number-----");
        x = sc.nextInt();

        System.out.print("\nThe factors of the " + x + " are: ");
        while (k <= x) {
            if (x % k == 0) {
                System.out.print(i + " ");
            }
            ++i;
        }
        System.out.print("\n");*/



        int say=753;
        int bol=say;
        int digit=0;
        while (bol>0){

            digit+=bol%10;
            bol=bol/10;
        }
        System.out.println(digit);






    }
}
