import java.util.Scanner;

public class BearBrother{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int years = 0;
        while(a <= b){
            years++;
            a *= 3;
            b *= 2;
        }
        System.out.println(years);
        sc.close();
    }
}