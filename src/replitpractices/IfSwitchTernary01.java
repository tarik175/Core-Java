package replitpractices;

import java.util.Scanner;

public class IfSwitchTernary01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int weight=scan.nextInt();
        double height=scan.nextDouble();

        double bmi= (double) weight /(height*height);
        System.out.println("Your BMI is : "+bmi);

        if (bmi<18.5){
            System.out.println("youre weak");
        }
        else if (bmi>18.5&&bmi<25){
            System.out.println("your weight is ideal");
        } else if (bmi>25&&bmi<30) {
            System.out.println("you're fat");
        }else{
            System.out.println("obese");
        }


    }
}
