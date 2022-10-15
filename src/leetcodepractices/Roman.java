package leetcodepractices;

import java.util.Scanner;

public class Roman {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        String s=scan.nextLine();
        int romInNum=0;
        int counterforI=0;
        int counterforV=0;
        int counterforX=0;
        int counterforL=0;
        int counterforC=0;
        int counterforD=0;
        int counterforM=0;

        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='I'){
                counterforI=counterforI+1;
            }
            else if (s.charAt(i)=='V'){
                counterforV=counterforV+1;
            }
            else if (s.charAt(i)=='X'){
                counterforX=counterforX+1;
            }
            else if (s.charAt(i)=='L'){
                counterforL=counterforL+1;
            }
            else if (s.charAt(i)=='C'){
                counterforC=counterforC+1;
            }
            else if (s.charAt(i)=='D'){
                counterforD=counterforD+1;
            }
            else if (s.charAt(i)=='M'){
                counterforM=counterforM+1;
            }

        }


        if (s.contains("IV")){
            counterforI=counterforI-1;
            counterforV=counterforV-1;
            romInNum=romInNum+4;
        }
        if (s.contains("IX")){
            counterforI=counterforI-1;
            counterforX=counterforX-1;
            romInNum=romInNum+9;

        }
        if (s.contains("XL")){
            counterforX=counterforX-1;
            counterforL=counterforL-1;
            romInNum=romInNum+40;

        }
        if (s.contains("XC")){
            counterforX=counterforX-1;
            counterforC=counterforC-1;
            romInNum=romInNum+90;


        }
        if (s.contains("CD")){
            counterforC=counterforC-1;
            counterforD=counterforD-1;
            romInNum=romInNum+400;
        }
        if (s.contains("CM")){
            counterforC=counterforC-1;
            counterforM=counterforM-1;
            romInNum=romInNum+900;

        }


        romInNum=(counterforI)+(counterforV*5)+(counterforX*10)+(counterforL*50)+(counterforC*100)+(counterforD*500)+(counterforM*1000);
        System.out.println(romInNum);








    }


}
