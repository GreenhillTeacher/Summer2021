package com.suarez;
/*This is the program that will print a mirror
 Version using For loop
 06/04/2020
 This is my other line*/
public class Challenge2_3V2 {
    public static final int SIZE = 5;

    public static void main(String[] args) { //main method
        // Call all my functions
        Line();
        Top();
        Bottom();
        Line();

    }

    public static void Line() {
        System.out.print("#");
        // initilize       control    increment the
        // a variable   the variable    var by 1
        for (int dash = 0; dash < 4 * SIZE; dash++) {
            System.out.print("=");
        }
        System.out.println("#");

    }

    public static void Top()    // This method prints the top shape
    {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            spacesDown(line);
            System.out.print("<>");
            for (int dots = 1; dots <= 4 * line - SIZE+1; dots++) {
                System.out.print(".");
            }
            System.out.print("<>");
            spacesDown(line);
            System.out.println("|");
        }
    }

    public static void spacesDown(int line) {
        for (int space = 1; space <= -2 * line + 2 * SIZE; space++) {
            System.out.print(" ");
        }
    }

    public static void Bottom()    // This methods print the upper boxes
    {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            spacesUp(line);
            System.out.print("<>");
            for (int dots = 1; dots <= -4 * line + 4 * SIZE; dots++) {
                System.out.print(".");
            }
            System.out.print("<>");
            spacesUp(line);
            System.out.println("|");
        }

    }


public static void spacesUp(int line){
    for(int space=1; space<=2*line-SIZE/2; space++){
        System.out.print(" ");
    }
}

}
