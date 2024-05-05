public class NegativeNumbersArray {
    public static void main(String [] args){
        int[] arr={1,2,3,4,-5,-7,-2,3,-7};

        System.out.println("Negative numbers of the array :");
        for (int i=0; i<arr.length; i++){
            if (arr[i]<0){
                System.out.println(arr[i]);
            }
        }
    }
    
}