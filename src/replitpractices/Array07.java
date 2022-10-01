package replitpractices;

import java.util.Arrays;

public class Array07 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int element=6;
        int arr2[]=new int[5];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==element){
                continue;
            }
            arr2[i]=arr[i];
        }

        System.out.println("["+arr2[0]+", "+arr2[1]+", "+arr2[2]+", "+arr2[3]+", "+arr2[4]+"]");
    }
}
