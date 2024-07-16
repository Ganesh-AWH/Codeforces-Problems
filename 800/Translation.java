import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int p1 = str1.length()-1;
        int p2 = 0;
        boolean flag = true;
        while(p1!=-1){
            if(str1.charAt(p1) != str2.charAt(p2)){
                flag = false;
                break;
            }
            p1--;
            p2++;
        }
        System.out.println(flag ? "YES" : "NO");
        sc.close();
    }
}
