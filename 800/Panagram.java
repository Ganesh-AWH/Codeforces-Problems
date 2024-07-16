import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        System.out.println(solve()?"YES":"NO");
    }
    public static boolean solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        String str = sc.next();
        sc.close();
        if(n<26) return false;
        boolean []flag = new boolean[26];
        for(int i=0; i<n; i++){
            char c = Character.toLowerCase(str.charAt(i));
            flag[c - 'a'] = true;
        }
        for(int i=0; i<26; i++){
            if(!flag[i]) return false;
        }
        return true;
    }
}

