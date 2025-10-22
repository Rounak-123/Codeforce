//Game with Integers
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int c=sc.nextInt();
            if(c%3==0){
                System.out.println("Second");
            }
            else{
                System.out.println("First");
            }
        }
    }
}
