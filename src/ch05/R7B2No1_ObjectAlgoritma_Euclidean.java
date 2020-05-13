package ch05;
import java.util.Scanner;
public class R7B2No1_ObjectAlgoritma_Euclidean{
	public static void main(String[]args){
		R7B2No1_Algoritma_Euclidean euclidean = new R7B2No1_Algoritma_Euclidean();
		System.out.println(" Program Algoritma Euclidean : Mencari PBB ");
		System.out.println();

		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Nilai Bilangan M : ");
		euclidean.m = a.nextInt();
		Scanner b = new Scanner (System.in);
		System.out.print(" Masukkan Nilai Bilangan N : ");
		euclidean.n = b.nextInt();
		
		euclidean.cetak();
		
	}
}