
package com.suarez;
import java.util.*;
/*Write a program that outputs a person's "gangsta name."
–first initial
–Diddy
–last name (all caps)
–first name
–-izzle
Example Output:
Type your name, playa: Marge Simpson
Your gangsta name is "M. Diddy SIMPSON Marge-izzle"*/
public class StringExamples {
    public static Scanner console= new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Type your name, playa: ");
        String fullName = console.nextLine();
        System.out.println(fullName);
        char initial= fullName.charAt(0);
        System.out.print("Give me a number: ");
        int number= console.nextInt();
        System.out.print("Your number is "+ number);
        MyMethod(fullName, console);
        //find the first initial char finitial=fullName.charAt(0)
        //find first name
        //find last name    find the indexOf " " and substring
    }
    public static void MyMethod(String name, Scanner keyboard){
        String firstName= name.substring(0,name.indexOf(" "));
        String otherName= keyboard.nextLine();
        Challenge2.Line();
    }
}