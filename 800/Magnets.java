import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        System.out.println(solve());
    }
    public static int solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int group = 1;
        String prev = sc.next();
        while(n-->1){
            String curr = sc.next();
            if(prev.charAt(1) == curr.charAt(0)){
                group++;
            }
            prev = curr;
        }
        sc.close();
        return group;
    }
}
