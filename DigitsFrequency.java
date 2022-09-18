import java.util.Scanner;
public class DigitsFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digit u wanna enter: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            System.out.print(i+1+": ");
            arr[i]=sc.nextInt();
            System.out.println();
        }
        System.out.print("enter the digit u want to find: ");
        int f=sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++) {
            if(arr[i]==f) {
                flag++;
            }
        }
        System.out.println("The digit "+f+"'s frequency is: "+flag);
    }
    
}
