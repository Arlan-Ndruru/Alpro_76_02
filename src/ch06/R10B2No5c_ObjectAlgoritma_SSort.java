package ch06;

public class R10B2No5c_ObjectAlgoritma_SSort{
	public static void main(String args[]) 
	{ 
		R10B2No5c_Algoritma_SSort ob = new R10B2No5c_Algoritma_SSort(); 
		int arr[] = {82,12,41,38,19,26,9,48,20,55,8,32,3}; 
		ob.sort(arr); 
		System.out.println("Urutan Array Setelah Di SSort : "); 
		ob.printArray(arr); 
	}
}