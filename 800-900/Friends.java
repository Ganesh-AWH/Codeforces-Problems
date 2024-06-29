import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int anton = 0;
        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'A'){
                anton++;
            }
        }
        int danik = n - anton;
        if(anton > danik){
            System.out.println("Anton");
        }else if(danik > anton){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
        sc.close();
    }
}
