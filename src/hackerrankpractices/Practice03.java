package hackerrankpractices;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();

            while(s1.length() < 15) {
                s1 = s1 + " ";
            }

            System.out.print(s1);

            if (x < 10) {
                System.out.println("00" + x);
            } else if (x < 100) {
                System.out.println("0" + x);
            } else {
                System.out.println(x);
            }
        }
        System.out.println("================================");

    }
}
