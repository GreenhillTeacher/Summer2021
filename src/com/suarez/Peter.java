package com.suarez;
import java.util.Scanner;
public class Peter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your phrase:");
        String phrase = input.nextLine();
        int indexOf = phrase.indexOf(" ");
        String firstword = phrase.substring(0, indexOf+1);
        int count = 0;
        char firstletter;

        for (int i = 0; i < firstword.length(); i++) {
            firstletter = firstword.charAt(i);
            if(firstletter !=' ') {
                count++;
                System.out.print(firstletter+ " ");
                String temp = firstword.substring(i + 1);
                int index = temp.indexOf(firstletter);
            //    System.out.println(temp + " " + index);
                while (index > 0) {
                    count++;
                    temp = temp.substring(index + 1);
                    index =temp.indexOf(firstletter);
                //    System.out.println(temp + " " + index);
                    //index needs to change
                }
                System.out.println( count);
                firstword=firstword.replace(firstletter,' ');
                count=0;
            }

        }
    }
}


