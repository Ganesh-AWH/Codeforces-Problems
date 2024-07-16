import java.util.Scanner;

public class CatchTheCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            // int x = sc.nextInt();
            int y = sc.nextInt();
            if(-1<=y){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

