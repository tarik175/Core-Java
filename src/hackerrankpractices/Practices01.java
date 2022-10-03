package hackerrankpractices;
import java.util.*;

public class Practices01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n%2==0){
            if (n>1&&n<6){
                System.out.println("Not Weird");
            } else if (n>5&&n<21) {
                System.out.println("Weird");
            } else if (n>20) {
                System.out.println("Not Weird");
            }
        }else {
            System.out.println("Weird");
        }
    }
}
