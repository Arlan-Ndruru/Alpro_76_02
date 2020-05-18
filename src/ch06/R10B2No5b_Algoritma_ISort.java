package ch06;

public class R10B2No5b_Algoritma_ISort{
	void sort(int arr[]){ 
		int n = arr.length; 
		for (int i = 1; i < n; ++i) { 
			int key = arr[i]; 
			int j = i - 1; 

			while (j >= 0 && arr[j] > key) { 
				arr[j + 1] = arr[j]; 
				j = j - 1; 
			} 
			arr[j + 1] = key; 
		} 
	} 
	public static void printArray(int arr[]){ 
		int n = arr.length; 
		System.out.print("Urutan Array Setelah Di ISort : "); 		
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i] + ", "); 

		System.out.println(); 
	} 

}