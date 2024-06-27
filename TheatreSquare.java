import java.util.Scanner;

public class TheatreSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a = sc.nextInt();
        int area1 = (int)Math.ceil((double)m/(double)a);
        int area2 = (int)Math.ceil((double)n/(double)a);
        // while(m!=0 || n!=0){
        //     if(m > 0){
        //         m -= a;
        //         area1++;
        //         if(m<0) m=0;
        //     }
        //     if(n>0){
        //         n -= a;
        //         area2++;
        //         if(n<0) n = 0;
        //     }
        // }
        long ans = area1 * area2;
        System.out.println(ans);
        sc.close();
    }
}