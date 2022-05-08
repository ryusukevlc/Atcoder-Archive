package AtCoder_Beginners_Selection.Placing_Marbles;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr = a.split("");
        int count = 0;
        for (int i = 0 ; i < 3 ; i++) {
            if (Integer.parseInt(arr[i]) == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
    
}
