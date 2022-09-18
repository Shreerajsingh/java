import java.util.Scanner;
public class NGETR {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int arr[] = new int[n];
        int arry[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]= scn.nextInt();
        }   
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                if(arr[j]>arr[i]) {
                    arry[i]=arr[j];
                    break;
                }
                else {
                    arry[j]=-1;
                }
            }
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }  
        System.out.println();
        System.out.print("Ur new array: ");
        for(int i=0;i<n;i++) {
            System.out.print(arry[i]+" ");
        }  
    }
}
