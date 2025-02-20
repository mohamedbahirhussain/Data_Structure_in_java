package DSAQuestions;

import java.util.Scanner;

public class endwordat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter name");
        String name = scn.nextLine().trim();

        System.out.println("Your name is ");


        if(name.length() >= 2 && name.endsWith("at")){
            System.out.println(name);
        }
        else {
            System.out.println("Word not end with at");
        }
        scn.close();
    }
}