package ch09;
import java.util.Scanner;
public class R13B2No3c_ObjectSOS{
	public static void main(String[] args) {
		R13B2No3c_SOS object = new R13B2No3c_SOS();
		System.out.println(" Program Algoritma Sieve of Sundaram : ");
		System.out.println();

		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Batas Bilangan : ");
		int n = a.nextInt(); 
		System.out.print(" Menampilkan Bilangan Prima kecil dari "+ n +" : ");
		object.SieveOfSundaram(n); 
		}	
}