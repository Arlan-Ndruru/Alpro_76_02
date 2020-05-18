package ch07;

public class R11B2No2b_ObjectAlgoritma_MergeS{
	public static void main(String args[]){ 
		int arr[] = {82,12,41,38,19,26,9,48,20,55,8,32,3}; 

		R11B2No2b_Algoritma_MergeS ob = new R11B2No2b_Algoritma_MergeS(); 
		System.out.println("Array Yang Diinputkan : "); 
		ob. printArray(arr); 

		ob.sort(arr, 0, arr.length-1); 
		System.out.println();
		System.out.println("Array Setelah Di Merge Sort : "); 
		ob.printArray(arr); 
	} 
}