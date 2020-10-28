package pract3;

import java.util.Scanner;

public class scaneer {
    public static void main(String[] args) {
        namescaneer();
        calc();
    }
    public static void namescaneer(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter your name");
        String name=scanner.next();
        System.out.println("welcome to the world ,"+name);
    }
    public static void calc(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter first num");
        int num =scanner.nextInt();
        System.out.println("enter first num2");
        int num2 =scanner.nextInt();
        int finalresult =num+num2;
        System.out.println("additional of the givennum is " + finalresult);

    }
}
