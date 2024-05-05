public class TransposeMatrix {
    public static void main(String[] args){

        int[][] arr={   {6,4,8},
                        {5,1,3},
                        {7,2,9} };

        System.out.println("Transpose of the given array is : ");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    
}