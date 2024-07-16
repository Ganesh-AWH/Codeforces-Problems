import java.util.Scanner;
import java.util.Stack;

public class StonesTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(int i=0; i<n; i++){
            char c = str.charAt(i);
            if(stack.isEmpty() || stack.peek() != c){
                stack.push(c);
            }else{
                stack.pop();
                stack.push(c);
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
