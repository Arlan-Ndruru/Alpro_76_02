package ch05;

public class R7B2No4_ObjectAlgoritma_LongestIS{
	public static void main(String args[]){ 
		int arr[] = { 30, 22, 9, 33, 25, 55, 41, 60 }; 
		R7B2No4_Algoritma_LongestIS algoritma = new R7B2No4_Algoritma_LongestIS();
			int n = arr.length; 
			System.out.println("Length Dari LongestIS : " + algoritma.lis( arr, n ) + "\n" ); 
	}
}