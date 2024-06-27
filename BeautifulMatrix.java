import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        int r = 0; 
        int c = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                int n = sc.nextInt();
                if(n == 1){
                    r = i;
                    c = j;
                    
                }
            }
        }

        int moves = Math.abs(r-3) + Math.abs(c - 3);
        System.out.println(moves);
        sc.close();
    }
}
