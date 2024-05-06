import java.util.Scanner;

public class MaximumBorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i = 0; i < size; i++) {
            int max = 0;
            int row = sc.nextInt();
            int col = sc.nextInt();
            String[] str = new String[row];
            for(int j = 0; j < row; j++) {
                str[j] = sc.next();
            }
            int count = 0;
            for(int k = 0; k < str.length; k++) {
                String temp = str[k];
                for (int j = 0; j < temp.length(); j++) {
                    if (temp.charAt(j) == '#') {
                        count++;
                    } else {
                        max = Math.max(max, count);
                        count = 0;
                    }
                }
            }
            System.out.println(max);
        }
    }
}