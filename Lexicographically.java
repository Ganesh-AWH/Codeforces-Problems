import java.util.Scanner;

public class Lexicographically{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int ans = 0;
        for(int i=0; i<str1.length(); i++){
            int c1 = Character.toLowerCase(str1.charAt(i));
            int c2 = Character.toLowerCase(str2.charAt(i));

            c1 = c1 - 'a';
            c2 = c2 - 'a';

            if(c1 < c2){
                ans = -1;
                break;
            }else if(c1  > c2){
                ans  = 1;
                break;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}