import java.util.Scanner;

public class Team{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int ans = 0;
        while(n-->0){
            int count = 0;
            String []str = sc.nextLine().split(" ");
            for(String s:str){
                if(s.equals("1")) count++;
            }
            if(count >= 2) ans++;
        }
        System.out.println(ans);
        sc.close();
    }
}