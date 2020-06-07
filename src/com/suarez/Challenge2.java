package com.suarez;
/*This is the program that will print a mirror
 We are going to program challenge2
 06/04/2020
 Maria Suarez  */
public class Challenge2 {
public static final int SIZE=6;
    public static void main(String[] args) { //main method
	// This shows how to print something in a line
     Line();
     Top();
     Bottom();
     Line();
    }
    // This method prints the top shape
    public static void Top()
    {
       for (int line =1; line <SIZE+1; line ++){
           System.out.print("|");
           for (int spaces=1; spaces <=-2*line+2*SIZE; spaces++){
               System.out.print(" ");
           }
           System.out.print("<>");
           for(int dots=1; dots <= 4*line-SIZE+2; dots++){
               System.out.print(".");
           }
           System.out.print("<>");
           for (int spaces=1; spaces <=-2*line+2*SIZE; spaces++){
               System.out.print(" ");
           }
           System.out.println("|");
       }
    }

    public static void Bottom()    // This methods print the upper boxes
    {
        for (int line =1; line <SIZE +1; line ++){
            System.out.print("|");
            for (int spaces=1; spaces <= 2*line-SIZE/2+1; spaces++){
                System.out.print(" ");
            }
            System.out.print("<>");
            for(int dots=1; dots <= -4*line +4*SIZE; dots++){
                System.out.print(".");
            }
            System.out.print("<>");
            for (int spaces=1; spaces <= 2*line-SIZE/2+1; spaces++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    public static void Line() // This method prints the bottom part of the box
    {
        System.out.print("#");
        //  declare var control value  increment
        for(int dash=0;    dash< 4*SIZE;  dash++){
        System.out.print("=");
    }
        System.out.println("#");
    }

}
