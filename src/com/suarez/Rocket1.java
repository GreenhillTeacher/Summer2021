package com.suarez;

public class Rocket1 {
    public static void main(String[] args) {
        Cone();
        Box();
        System.out.println("|United|");
        System.out.println("|States|");
        Box();
        Cone();
    }
    public static void Box(){
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
    public static void Cone(){
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }
}
