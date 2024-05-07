import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        
        int count = 0;
        int min = findMin(a);
        int i = 0;
        while (i < n) {
            if (a[i] >= b[i]) {
                while (a[i] > min) {
                    a[i] -= b[i];
                    count++;
                }
            }
            if (a[i] < min) {
                min = a[i];
                i = 0;
            }
            if (a[i] != min) {
                count = -1;
                break;
            }
            i++;
        }
        
        System.out.println(count);
    }
    
    public static int findMin(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}
