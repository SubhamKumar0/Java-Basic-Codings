import java.io.*;
import java.util.*;

class CommonArrayElements {
	public static void FindCommonElements(int[] arr1,int[] arr2)
	{
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

	
		for (int i : arr1) {
			set1.add(i);
		}
		for (int i : arr2) {
			set2.add(i);
		}
		set1.retainAll(set2);
		System.out.println("Common elements- " + set1);
	}
	public static void main(String[] args)
	{
		int[] arr1= { 91, 64, 99, 106, 285, 36, 74, 64, 81, 111 };
		int[] arr2 = { 10, 99, 64, 709, 396, 58, 186, 93, 74, 111 };

		System.out.println("Array 1: "+ Arrays.toString(arr1));
		System.out.println("Array 2: "+ Arrays.toString(arr2));
		FindCommonElements(arr1, arr2);
	}
}
