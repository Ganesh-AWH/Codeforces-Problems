import java.util.Scanner;

public class WordSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        while(k --> 0){
            if(num % 10 == 0){
                num /= 10;
            }else{
                num--;
            }
        }
        System.out.println(num);
        sc.close();
    }
}
