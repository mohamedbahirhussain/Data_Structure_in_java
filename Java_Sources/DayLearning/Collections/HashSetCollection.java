package DayLearning.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetCollection {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
//        Scanner scn = new Scanner(System.in);
//
//        for(int i=0; i<4; i++){
//            names.add(scn.nextLine());
//        }
//        System.out.println(names);

        HashSet<String> hs = new HashSet<>();
        Scanner scnr = new Scanner(System.in);
        for(int i=0; i<4; i++){
            hs.add(scnr.nextLine());
        }
        System.out.println(hs);
    }
}
