package Practices6;

import java.util.Random;

public class Arrypra {
    public static void main(String[] args) {
        int []numbers=new int[5];
        numbers[0]=1234;



        // random int every time
        Random random=new Random();
        int x=random.nextInt(50);
        //System.out.println(x);
       for (int i=0;i<numbers.length;i++) {
           numbers[i]=random.nextInt(50);
           // numbers[0]=random.nextInt(50);
           //numbers[1]=random.nextInt(50);
           //numbers[2]=random.nextInt(50);
           System.out.println(numbers.length);
       }

       // System.out.println(numbers[1]);
        for (int i = 0; i<numbers.length; i++)
        System.out.println(numbers[i]);
    }
}
