import java.util.Scanner;

public class TwoMovies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int []a = new int[n];
            int []b = new int[n];
            for(int i=0; i<n; i++) a[i] = sc.nextInt();
            for(int i=0; i<n; i++) b[i] = sc.nextInt();
            
            int movie1 = 0;
            int movie2 = 0;
            int np = 0;
            int nn = 0;
            for(int i=0; i<n; i++){
                if(a[i] > b[i]) movie1 += a[i];
                else if(b[i] > a[i]) movie2 += b[i];

                else if(a[i] == 1) np++;
                else if(a[i] == -1) nn++;
            }

            while(np-->0){
                if(movie1 > movie2) movie2++;
                else movie1++;
            }

            while(nn-->0){
                if(movie1 > movie2) movie1--;
                else movie2--;
            }

            System.out.println(Integer.min(movie1, movie2));
        }   
        sc.close();
    }
}
