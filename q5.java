//How Much Does Daytona Cost?
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            int k=sc.nextInt();
            int c=0;
            for(int i=0;i<n;i++){
                int num=sc.nextInt();
                if(num==k){
                    c++;
                }
            }
            if(c==0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }

        }
    }
}