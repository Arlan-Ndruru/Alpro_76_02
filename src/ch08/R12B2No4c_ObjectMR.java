package ch08;
import java.io.*; 
import java.math.*; 

public class R12B2No4c_ObjectMR{
	public static void main(String args[]) { 
		System.out.println(" Program Algoritma Miller - Rabbin : ");
		System.out.println();
		R12B2No4c_MR object = new R12B2No4c_MR();
		int k = 4;
		System.out.print(" Menampilkan Semua Prima "
								+ "Dari 100: "); 
								
		for (int n = 1; n < 100; n++) 
			if (object.isPrime(n, k)) 
				System.out.print(n + " "); 
	}
}