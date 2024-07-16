import java.util.Scanner;

public class SoldierBannas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //first banana price
        int k = sc.nextInt();
        //initial amount
        int w = sc.nextInt();
        //required bananas
        int n = sc.nextInt();

        long sum = n * (n+1)/2;
        sum *= k;
        long diff = sum - w;
        System.out.println(diff > 0 ? diff : 0);
        sc.close();
    }
}
