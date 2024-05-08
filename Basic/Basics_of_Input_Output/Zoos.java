import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        int z = 0, o = 0;
        for(int i = 0; i < str.length; i++) {
            if(str[i].equalsIgnoreCase("z")) {
                z++;
            }
            if(str[i].equalsIgnoreCase("o")) {
                o++;
            }
        }

        if((2*z) == o) System.out.println("Yes");
        else System.out.println("No");
    }
}