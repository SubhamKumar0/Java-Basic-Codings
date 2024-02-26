import java.util.Scanner;
public class Swapping{
    public static void main(String args[]){
        
        int a,b;

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the value of the first number:");
        a=sc.nextInt();
        
        System.out.println("Enter the value of the second number:");
        b=sc.nextInt();

        System.out.println("Before Swapping:");
        System.out.println("a value is :" +a);
        System.out.println("b value is :" +b);
        
        int temp=a;
        a=b;
        b=temp;

        System.out.println("After Swapping:");
        System.out.println("a value is :" +a);
        System.out.println("b value is :" +b);
        
    }
}