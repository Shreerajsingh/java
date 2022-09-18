import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

public class Deci2AnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any decimal number: ");
        int n= sc.nextInt();   
        System.out.print("Enter any base number u want to change it in: ");
        int b= sc.nextInt();
        int z=n;
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for(int i=0;i<=n;i++) {
                arr.add(z%b);
                z=z/b;
                if(z==0) {
                    break;
                }
        }     
        double sum=0;
        int d=arr.size();
        for(int i=0;i<d;i++) {
                sum=sum +arr.get(i)*(Math.pow(b,i+1));
        }
        System.out.println(sum);
        for(int i=0;i<d;i++) {
                System.out.print(arr.get(i));
        }
    }
 }
    