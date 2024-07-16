import java.util.Scanner;

public class Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        long ans = 0;
        while(n-->0){
            int f = sc.nextInt();
            if(f>h){
                ans += 2;
            }else{
                ans += 1;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
