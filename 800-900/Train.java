import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int passengers = 0;
        int max = 0;
        while(n-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            passengers -= x;
            passengers += y;
            max = Integer.max(max, passengers);
        }
        System.out.println(max);
        sc.close();
    }
}
