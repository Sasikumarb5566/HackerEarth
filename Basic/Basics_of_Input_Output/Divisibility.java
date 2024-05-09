import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(divisibility(n, a));
    }

    public static String divisibility(int n, int[] a) {
        if(a[n-1] % 10 == 0) {
            return "Yes";
        }
        else {
            return "No";
        }
    } 
}