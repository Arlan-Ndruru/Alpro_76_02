package ch09;
import java.util.Scanner;
public class R13B2No1c_ObjectSOA{

	public static void main(String[] args){ 
		R13B2No1c_SOA object = new R13B2No1c_SOA();
		System.out.println(" Program Algoritma Sieve of Atkin : ");
		System.out.println();
		Scanner a = new Scanner(System.in);
		System.out.print(" Masukkan batas Bilangan Prima : ");
		int limit = a.nextInt(); 

		
		System.out.print(" Menampilkan Bilangan Prima Kecil dari "+limit+" : ");
		object.SieveOfAtkin(limit); 
	}
}