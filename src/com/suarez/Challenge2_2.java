package com.suarez;
/*This is the program that will print a rocket
 We are going to print something
 06/03/2020
 This is my other line*/
public class Challenge2_2 {

    public static void main(String[] args) { //main method
	// Call all my functions
        Line();
        Top();
        Bottom();
        Line();

    }
    public static void Line(){
        System.out.println("#================#");
    }
    public static void Top()    // This method prints the top shape
    {
        System.out.println("|      <><>      |");
        System.out.println("|    <>....<>    |");
        System.out.println("|  <>........<>  |");
        System.out.println("|<>............<>|");
    }
    public static void Bottom()    // This methods print the upper boxes
    {
        System.out.println("|<>............<>|");
        System.out.println("|  <>........<>  |");
        System.out.println("|    <>....<>    |");
        System.out.println("|      <><>      |");
    }


}
