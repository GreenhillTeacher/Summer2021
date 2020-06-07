package com.suarez;
/*This is the program that will print a mirror
 We are going to use functions and for loops
 06/05/2020
 Maria Suarez  */
public class Challenge2V2 {
public static final int SIZE=5;  // Declaring a Global Constant
    public static void main(String[] args) { //main method
	// This shows how to print something in a line
     Line();
     Top();
     Bottom();
     Line();
    }

    public static void Top()    // This method prints the top shape
    {

        for(int line=1; line <SIZE+1; line++){
            System.out.print("|");
            //this for loop make the spaces before <>
            spaceUp(line);
            System.out.print("<>");
            //this for loop make the dots between <>
            for(int dot =1; dot <= 4*line -SIZE+1; dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            spaceUp(line); //make the spaces after <>
            System.out.println("|");
        }
    }
    public static void spaceUp(int line){
        for(int space=1; space<=-2*line+2*SIZE; space++){
            System.out.print(" ");
        }
    }

    public static void Bottom()    // This methods print the upper boxes
    {
        for(int line=1; line <SIZE+1; line++){
            System.out.print("|");
            //this for loop make the spaces before <>
            for(int space=1; space<=2*line-SIZE/2; space++){
                System.out.print(" ");
            }
            System.out.print("<>");
            //this for loop make the dots between <>
            for(int dot =1; dot <= -4*line +4*SIZE; dot++) {
                System.out.print(".");
            }
            System.out.print("<>");

            //this for loop make the spaces after <>
            for(int space=1; space<=2*line-SIZE/2; space++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    public static void Line() // This method prints the bottom part of the box
    {
        System.out.print("#");
        //  declare var control value  increment
        for(int dash=0;    dash<4*SIZE;    dash++){
            System.out.print("=");
        }
        System.out.println("#");
    }

}
