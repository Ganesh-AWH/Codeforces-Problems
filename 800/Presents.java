import java.util.*;
public class Presents {
    public static void main(String[] args) {
        solve();
    }    
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int []ans = new int[n];
        for(int i=0; i<n; i++){
            int num = arr[i];
            ans[num-1] = i+1;
        }
        for(int i:ans) System.out.print(i+" ");
        sc.close();
    }
}
