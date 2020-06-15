package com.suarez;
import java.util.Scanner;
public class lastClass {
    public static int indexOf;
    public static String firstword;
    public static char letter;
    public static void main(String[] args) {
        Scanner screen = new Scanner(System.in);
        System.out.println("Say something!");
        String phrase = screen.nextLine();
        indexOf = phrase.indexOf(" ");
        firstword = phrase.substring(0, indexOf+1);// "Peter "
        phrase = phrase.substring(indexOf+1);
        letter=' ';
        int count = 0;
        countingLettersFW(letter,count, phrase);
    }
    public static void countingLettersFW(char letter, int count, String phrase){
        for (int index = 0; index < firstword.length(); index++) {
            letter = firstword.charAt(index);
            if (letter != ' ') {
                count++;
                String temp = firstword.substring(index + 1);
                indexOf = temp.indexOf(letter);
                while (indexOf >= 0) {
                    count++;
                    //   System.out.println(te  mp + " " + indexOf);
                    temp = temp.substring(indexOf + 1);
                    indexOf = temp.indexOf(letter);
                }
                countingLettersMessage(letter, count, phrase);
                //  replace the letter you just finished in the firstword with a ' '
                firstword = firstword.replace(letter, ' ');
                System.out.println(letter + " " + count);
                count = 0;
            }
        }
    }
    public static void countingLettersMessage(char letter,int count, String phrase){

    }

}
