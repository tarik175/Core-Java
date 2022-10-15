package day21varargsstringbuildersaccessmodifiers;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {

        //Find the smallest positive integer and greatest negative integer in a given integer list
        ArrayList<Integer> list=new ArrayList<>();
        list.add(-12);
        list.add(18);
        list.add(-5);
        list.add(23);
        list.add(-2);

        int smallPos=Integer.MAX_VALUE;
        int greatNeg=Integer.MIN_VALUE;
        for (int w:list) {
            if (w<0&&w>greatNeg){
                greatNeg=w;
            } else if(w>0&&w<smallPos) {
                smallPos=w;
            }
        }
        System.out.println(greatNeg+"///"+smallPos);

    }
}
