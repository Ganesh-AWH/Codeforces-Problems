import java.util.Scanner;

public class SubstringSubsequence {
    //our question we want to find the string c, such that a subsequence and b is subtring - minimize
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            String str1  = sc.next();
            String str2  = sc.next();
            int m = str1.length();
            int n = str2.length();
            int ans = m + n;
            for(int start=0; start<n; start++){
                int ptr = start;
                for(int j=0; j<m; j++){
                    if(ptr<n && str2.charAt(ptr) == str1.charAt(j)) ptr++;
                }
                int len = ptr - start;
                ans = Integer.min(ans, (m + n - len));
            }
            System.out.println(ans);
        }
        sc.close();
    }

}
