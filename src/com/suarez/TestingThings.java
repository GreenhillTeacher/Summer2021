package com.suarez;
import java.util.Scanner;

public class TestingThings {

    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        int num = 7; // primitive data type
        // byte,int, short, long,char, boolean, float,double
        // object is an instance of a class
        System.out.print("Pease enter your full name");
        String fullName= keyboard.nextLine();
        int indexOf= fullName.indexOf(" ");
        System.out.println(indexOf);
        String lastName= fullName.substring(indexOf+1);//String is an array of char
        String firstName= fullName.substring(0, indexOf);
        byMyself(firstName, keyboard);
        byMyself(lastName, keyboard);
        Challenge2.Line();
        char letter = firstName.charAt(0);
        System.out.println(letter + ".");
    }
    public static void byMyself(String name, Scanner keyboard){
        name= name.toUpperCase();
        String secondName= keyboard.next();
        System.out.println("HEllo " + name.toLowerCase());
        System.out.println("HEllo " + name);
    }
}
