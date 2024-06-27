import java.util.*;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<str.length(); i+=2){
            list.add(str.charAt(i)-'0');
        }
        Collections.sort(list);
        for(int i=0; i<list.size()-1; i++){
            System.out.print(list.get(i)+"+");
        }
        System.out.println(list.get(list.size()-1));
        sc.close();
    }
}
