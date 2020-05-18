package ch09;
import java.util.Scanner;
public class R13B2No2c_ObjectSOE{
	
public static void main(String args[]){ 
		System.out.println(" Program Algoritma Sieve Of Eratosthenes : ");
		System.out.println();

		R13B2No2c_SOE object = new R13B2No2c_SOE();

		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Batas Bilangan : ");
		int n = a.nextInt(); 
		
		System.out.print(" Bilangan Prima "); 
		System.out.print(" Kecil dari " + n + " : "); 
		
		object.sieveOfEratosthenes(n); 
	}
}