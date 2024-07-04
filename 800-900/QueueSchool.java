import java.util.Scanner;

public class QueueSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        char []queue = sc.next().toCharArray();
        while(t-->0){
            for(int i=0; i<n-1; i++){
                if(queue[i] == 'B' && queue[i+1] == 'G'){
                    swap(queue, i, i+1);
                    i+=2;
                }
            }
        }
        for(char c: queue){
            System.out.print(c);
        }
        sc.close();
    }
    public static void swap(char []queue, int i, int j){
        if(j>=queue.length) return;

        char temp = queue[i];
        queue[i] = queue[j];
        queue[j] = temp;
    }
}
