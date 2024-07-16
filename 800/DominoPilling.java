import java.util.Scanner;

public class DominoPilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int t = m * n;
        System.out.println(t/2);
        sc.close();
    }
}
