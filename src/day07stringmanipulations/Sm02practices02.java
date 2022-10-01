package day07stringmanipulations;


import java.util.Scanner;

public class Sm02practices02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your child's name :");
        String name=sc.nextLine();
        if(name.contains("a")==true){
            System.out.println("This name contains a");
        }if(name.contains("z")){
            System.out.println("This name contains z");
        }else{
            System.out.println("This name contains neither");
        }





    }
}
