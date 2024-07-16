import java.util.Scanner;

public class CalculatingFuction {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n%2 == 0){
            System.out.println(n/2);
        }else{
            System.out.println(-(n/2)-1);
        }
        sc.close();
    }
}
