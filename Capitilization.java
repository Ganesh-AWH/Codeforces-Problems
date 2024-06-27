import java.util.Scanner;

public class Capitilization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(i == 0){
                System.out.print(Character.toUpperCase(c));
            }else{
                System.out.print(c);
            }
        }
        sc.close();
    }
}
