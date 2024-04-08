package hackerEarth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FavouriteSinger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int result = 0;
        Map<Long, Integer> have = new HashMap<>();

        for (int i = 0; i < n; i++) {
            long input = sc.nextLong();
            int count = have.getOrDefault(input, 0) + 1;
            have.put(input, count);
            max = Math.max(max, count);
        }

        for (Map.Entry<Long, Integer> entry : have.entrySet()) {
            if (entry.getValue() == max) {
                result++;
            }
        }

        System.out.println(result);
    }
}
