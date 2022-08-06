package ss_01_introduction_java.bai_tap;

import java.util.Scanner;

public class Show_name {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = nc.nextLine();
        System.out.println("Your name is : " + name);
    }
}
