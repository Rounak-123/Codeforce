//Halloumi Boxes

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
                boolean chk = true;
                for (int m = 0; m < arr.length - 1; m++) {
                    if (arr[m] > arr[m + 1]) {
                        chk = false;
                        break;
                    }
                }
            
                if (chk) {
                    System.out.println("YES");
                } else {
                    if (k == 1) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                }
            }
        }
    }

