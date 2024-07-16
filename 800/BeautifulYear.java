import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        year++;
        while(!isDistinct(year)){
            year++;
        }
        System.out.println(year);
        sc.close();
    }
    public static boolean isDistinct(int year){
        Set<Integer> set = new HashSet<>();
        while(year>0){
            int digit = year % 10;
            if(!set.add(digit)){
                return false;
            }
            year /= 10;
        }
        return true;
    }
}
