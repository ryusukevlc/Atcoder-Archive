import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();

        int ans_count = 0;

        for (int i = 0 ; i <= c ; i++) {
            for (int j = 0 ; j <= b ; j++) {
                for (int k = 0 ; k <= a ; k++) {
                    if (i*50 + j*100 + k*500 == x) {
                        ans_count += 1;
                    }
                }
            }
        }

        System.out.println(ans_count);
        sc.close();
    }

}
