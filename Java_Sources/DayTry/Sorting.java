package DayTry;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args){
        int a[] = {5, 7, 9, 1, 3, 6, 2, 4, 8};
        int num = 0;

        for(int i=0; i<a.length - 1; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] > a[j]){
                    num = a[i];
                    a[i] = a[j];
                    a[j] = num;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
