import java.util.Scanner;
public class BarChart {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<arr.length;i++) {
                arr[i]= sc.nextInt();
            }
            int max=arr[0];
            for(int i=0;i<arr.length;i++) {
                if(arr[i]>max) {
                    max=arr[i];
                }
            }
            for(int i=0;i<max;i++) {
                for(int j=0;j<n;j++) {
                    if(i>=max-arr[j]) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
    }
}
