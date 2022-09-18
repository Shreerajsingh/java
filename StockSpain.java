
import java.util.Scanner;
import java.util.Stack;
public class StockSpain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arrx[]=new int[n];
        Stack<Integer> st= new Stack<>();

        for(int i=0;i<n;i++) {                                //INPUT values in arr[];
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++) {                                //LOOP to check each and every element in arr[];
            int flag=0;
            for(int j=i;j>=0;j--) {                           //LOOP to check spain of arr[];
                flag += 1;                                    //COUNTER to check the spain of arr[];
                if(arr[j]>arr[i]) {
                    arrx[i]=flag-1;
                    break;
                }
                else {
                    arrx[i]=i+1;
                }
            }
        }
        for(int i=0;i<n;i++) {
            System.out.print(arrx[i]);
        }
    }    
}
