package ch08;
import java.util.Scanner;
public class R12B2No1c_ObjectLCSP{

	public static void main(String[] args){ 
		System.out.println(" Program Algoritma Longest Common Substring Problem : ");
		System.out.println();
		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Nilai Bilangan String Pertama : ");
		String X = a.nextLine();
		Scanner b = new Scanner (System.in);
		System.out.print(" Masukkan Nilai Bilangan String Kedua : ");
		String Y = b.nextLine();

		// String X = "OldSite:ArlanCoding.com"; 
		// String Y = "NewSite:W3School.com"; 

		R12B2No1c_LCSP object = new R12B2No1c_LCSP();
		int m = X.length(); 
		int n = Y.length(); 

		System.out.println(" Panjang Dari Longest Common Substring : "
				+ object.LCSubStr(X.toCharArray(), Y.toCharArray(), m, n)); 
	}
}