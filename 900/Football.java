import java.util.Scanner;

public class Football{
    public static void main(String[] args) {
        boolean flag = solve();
        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
    public static boolean solve(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        //checking for zero
        int zero = 0;
        int one = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '0') zero++;
            else zero = 0;

            if(str.charAt(i) == '1') one++;
            else one = 0;

            if(one >=7 || zero >=7) return true;
        }
        return false;
    }
}