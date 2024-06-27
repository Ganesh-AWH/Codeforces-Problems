import java.util.Scanner;

public class BitSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int x = 0;
        while(t-->0){
            String operation = sc.next();
            if(isPlus(operation)){
                x++;
            }else{
                x--;
            }
        }

        System.out.println(x);
        sc.close();
    }
    public static boolean isPlus(String str){
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == '+') return true;
        }

        return false;
    }
}
