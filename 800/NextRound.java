import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []players = new int[n];
        for(int i=0; i<n; i++){
            players[i] = sc.nextInt();
        }
        
        int kthScore = players[k-1];
        int count = 0;
        for(int i:players){
            if(i>0 && i>=kthScore){
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
