//We Need the Zero
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
       for(int t=0;t<loop;t++){
            int n= sc.nextInt();
            int mask=0;
            for(int i=0;i<n;i++){
                mask^=sc.nextInt();
            } if((n%2)==1){
                System.out.println(mask);
            }
            else if(n%2==0 && mask==0){
                System.out.println(mask);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}     