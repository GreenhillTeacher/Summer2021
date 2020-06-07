package com.suarez;
/*This is the program that will print a rocket
 We are going to print something
 06/03/2020
 This is my other line*/
public class Rocket3 {

    public static void main(String[] args) { //main method
	// This shows how to print something in a line
        Top();
        Box1();
        Box1();
        System.out.println("|United|");
        System.out.println("|States|");
        Box2();
        Box2();
        Box2();
        Box2();
        Top();


    }
    public static void Top()    // This method prints the top shape
    {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }
    public static void Box1()    // This methods print the upper boxes
    {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");

    }
    public static void Box2() // This method prints the bottom part of the box
    {

        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }

}
