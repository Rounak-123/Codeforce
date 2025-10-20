// Goals of Victory
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        for (int i = 0; i < loop; i++) {
            int n = sc.nextInt();
            int sum=0;
            for (int j = 0; j < n-1; j++) {
                sum += sc.nextInt();
            }
            System.out.println(-sum);
        }
}
}