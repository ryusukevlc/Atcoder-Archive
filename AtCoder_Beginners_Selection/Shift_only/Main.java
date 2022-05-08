package AtCoder_Beginners_Selection.Shift_only;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isEven = true;
        for (int i = 0 ; i < n ; i++) {
            if (arr[i] % 2 != 0) {
                isEven = false;
            }
        }
        
        int count = 0;
        if (isEven) {
            boolean isDivisible = true;

            Outer:
            while (isDivisible) {
                for (int i = 0 ; i < n ; i++) {
                    if (arr[i] % 2 != 0) {
                        isDivisible = false;
                        continue Outer;
                    }
                }
                for (int i = 0 ; i < n ; i++) {
                    arr[i] = arr[i] / 2;
                }
                count++;
            }

                System.out.println(count);
        } else {
            System.out.println("0");
        }

    }
}
