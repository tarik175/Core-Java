package day10forloopwhileloop;

public class ForLoopPractice {
    public static void main(String[] args) {
        //Q1
        for (int i=10;i<58;i++){
            System.out.println(i);
        }
        System.out.println("=============================");
        //Q2
        for (int i=100;i>42;i--){
            if (i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("===============================");
        //Q4
        int sum=0;
        for (int i=23;i<58;i++){
            sum+=i;

        }
        System.out.println(sum);

        System.out.println("=========================");

        int sum2=1;
        for (int i=7;i<16;i++){
            sum2*=i;

        }
        System.out.println(sum2);

        System.out.println("=========================");

        for (int i=0;i<200;i++){
            if (i%5==0){
                System.out.print(i+" ");
            }
        }


    }
}
