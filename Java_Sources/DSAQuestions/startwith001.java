package DSAQuestions;

import java.util.Scanner;

public class startwith001 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        scn.close();

        // Convert the number to a string to check if it starts with "001"
        String numStr = String.valueOf(num);

        if (numStr.startsWith("001")) {
            System.out.println("The number starts with 001");
        } else {
            System.out.println("The number does not start with 001");
        }
    }
}
