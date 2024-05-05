import java.util.Scanner;
import java.util.*;

public class EvenIndex {
    
    public static void main(String [] args){
        int sum=0;
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the size of array : ");
        int size =scanner.nextInt();

        int arr[]=new int[size];

        System.out.println("enter the values : ");
        for (int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }

        for (int i=0; i<arr.length;i=i+2){
            sum=sum+i;

        }
        System.out.println("the sum of Even index :"+sum);

    }
    
}