import java.util.Scanner;

public class GeorgeAccodomation {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        while(t-->0){
            int p = sc.nextInt();
            int q = sc.nextInt();
            if(q-p>=2) count++;
        }
        System.out.println(count);
        sc.close();
    }
}
