package ch05;
public class R7B2No2_ObjectAlgoritma_Kadane{
	public static void main(String[] args) {
		
		System.out.println(" Program Algoritma Kadane : Menentukan Nilai Maximum dari Subarray");
		System.out.println();

		R7B2No2_Algoritma_Kadane i = new R7B2No2_Algoritma_Kadane();
		int arrA[] = { 1, 2, -3, -4, 2, 7, -2, 3 };
		i.cetak();
		System.out.println();
		System.out.println("Maximum subarray : " + i.kandane(arrA));
		
		int arrB[] = { -2, -3, -4, -2, -7, -2, -3,-11 };
		i.cetak2();
		System.out.println();
		System.out.println("Maximum Subarray : " + i.KandaneModify(arrB));
	}
}