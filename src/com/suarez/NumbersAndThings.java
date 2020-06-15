package com.suarez;
import java.util.*;

public class NumbersAndThings {
    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);
        String answer;
        do {
            Random guess = new Random();
            int guess1 = guess.nextInt(50);
            System.out.printf(" %5d \n", guess1);
            double rndy = Math.random();// a random between 0 and 1
            int randy = (int) (rndy * 100);
         //   System.out.printf(" %10.5f  \n  %5d" \n, rndy, randy);
            System.out.println( "Do you want to try again  ");
            answer = input.next();
        }
        while(answer.equals("yes") );
    }

}
