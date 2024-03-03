import java.util.Scanner;

public class LongWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str = sc.next();
            if(str.length()<=10){
                System.out.println(str);
            }else{
                StringBuilder sb = new StringBuilder();
                sb.append(str.charAt(0));
                sb.append(str.length()-2);
                sb.append(str.charAt(str.length()-1));
                System.out.println(sb.toString());
            }
            sc.close();
        }
    }
}