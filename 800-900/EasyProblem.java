import java.util.Scanner;

public class EasyProblem {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            if(x == 1){
                System.out.println("HARD");
                return;
            }
        }
        sc.close();
        System.out.println("EASY");
    }
}
