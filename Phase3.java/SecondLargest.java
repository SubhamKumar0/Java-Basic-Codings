import java.util.Arrays;

public class SecondLargest {

    public static void main(String[] args){
        int[] a={98,67,89,99,16,39,107};
        Arrays.sort(a);

        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("second largest:"+a[a.length-2]);
    
        
    }
    
}