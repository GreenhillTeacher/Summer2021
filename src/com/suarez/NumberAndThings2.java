package com.suarez;
import java.util.*;
public class NumberAndThings2 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double doubly1=45.98;
        double doubly2=Math.sqrt(doubly1);
        double doubly3=doubly2*3.798;
        int num1=10;
        String answer;
        Random randy = new Random();
        do {
            int num2 = randy.nextInt(14)+75;
    //        String valName = "Greenhill is awesome";
     //       System.out.printf("%20.15s\n", valName);
            System.out.printf("random: %5d \n ", num2);
            System.out.println("Do you want to keep going");
            answer = input.next();
        } while( answer.contains("y"));
        //        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(doubly1);
//        System.out.println(doubly2);
//        System.out.println(doubly3);



    }
}
