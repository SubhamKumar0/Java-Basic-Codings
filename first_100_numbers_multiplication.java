public class first_100_numbers_multiplication{
    public static void main(String[] args) {
        long mul=1;

        for(long i=1;i<=100;i++)
        {
           mul*=i;
        }
        
        System.out.println(mul); 
    }
}