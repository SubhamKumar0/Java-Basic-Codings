import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        
    int a,b,c;

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the first number:");
    a=sc.nextInt();

    System.out.println("Enter the second number:");
    b=sc.nextInt();
    
    System.out.println("Enter the third number:");
    c=sc.nextInt();

    if(a>=b && a>=c){
        System.out.println("The greatest number is:"+a);
    }
    else if(b>=a && b>=c){
        System.out.println("The greatest number is:"+b);  
    }
    else{
        System.out.println("The largest number is:"+c);
    }
    }
    
}
