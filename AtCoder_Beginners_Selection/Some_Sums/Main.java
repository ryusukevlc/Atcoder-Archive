import java.util.Scanner;


class Main {

public static void main(String[] args) {

    
    Scanner sc = new Scanner(System.in);
    int count = 0;
    try {
   
        String n = sc.next();
        String a = sc.next();
        String b = sc.next();

        for (int i = 1 ; i <= Integer.parseInt(n) ; i++) {

            String[] array = String.valueOf(i).split("");

            int temp_count = 0;
            for (int j = 0 ; j < array.length ; j++) {
                temp_count += Integer.parseInt(array[j]);
            }

            if (Integer.parseInt(a) <= temp_count && temp_count <= Integer.parseInt(b)) {
                count += i;
            }
        }

    } catch (Exception e) {
        
    } finally {
        sc.close();
    }

    System.out.println(count);


}

}