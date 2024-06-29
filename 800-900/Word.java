import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int up = 0;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c)){
                up++;
            }
        }
        int lo = str.length() - up;
        System.out.println(up > lo ? str.toUpperCase() : str.toLowerCase());
        sc.close();
    }
}
