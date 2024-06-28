import java.util.*;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int num = sc.nextInt();
            List<Integer> digits = findSum(num);
            for(Integer i: digits) System.out.print(i); 
            System.out.println();
        }
        sc.close();
    }
    public static List<Integer> findSum(int num){
        List<Integer> list = new ArrayList<>();
        for(int i=9; i>0; i--){
            if(num >=i){
                list.add(i);
                num -= i;
            }
        }            
        if(num > 0){
            return Arrays.asList(-1);
        }
        Collections.sort(list);
        return list;
    }
}
