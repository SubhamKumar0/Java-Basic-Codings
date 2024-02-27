import java.util.Scanner;
public class OddEvenCount{
    public static void main(String args[]){

        int n;
        int EvenCount=0, OddCount=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the n value:");
        n=sc.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        
        for(int i=0;i<n;i++){
            if((arr[i]%2)==0)
            {
                EvenCount+=1;
            }
            else
            {
                OddCount+=1;
            }
        }
        System.out.println("Count of Even numbers:"+EvenCount);
        System.out.println("Count of Odd numbers:"+OddCount);
       
    }
}