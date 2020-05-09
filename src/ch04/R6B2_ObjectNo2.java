package ch04;
import java.util.Scanner;
public class R6B2_ObjectNo2{
	public static void main(String[] args) {
		R6B2_No2 matriks = new R6B2_No2();

		System.out.println();

		matriks.cetak();

		System.out.println();
		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Angka yang Dicari : ");
		matriks.angka = a.nextInt();

		System.out.println();		
		matriks.cetak2();
	}
}