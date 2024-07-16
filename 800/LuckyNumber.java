import java.util.Scanner;

public class LuckyNumber{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str = sc.next();
        long count = 0;
        for(int i=str.length()-1; i>=0; i--){
            char c = str.charAt(i);
            if(c == '4' || c == '7'){
                count++;
            }
        }
        // System.out.println(count);
        boolean flag = count > 0 ? true: false;
        while(count > 0){
            long digit = count % 10;
            count /= 10;
            if(digit != 7 && digit  != 4){
                flag = false;
            }
        }
        System.out.println(flag ? "YES" : "NO");
        sc.close();
    }
}