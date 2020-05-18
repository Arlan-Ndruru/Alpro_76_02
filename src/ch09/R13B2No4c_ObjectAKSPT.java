package ch09;
import java.util.Scanner;
public class R13B2No4c_ObjectAKSPT{
	public static void main(String[] args) {
		R13B2No4c_AKSPT object = new R13B2No4c_AKSPT();
		System.out.println();
		System.out.println();

		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Bilangan yang Ingin Dites : ");
		int n = a.nextInt(); 
		if (object.isPrime(n)) 
			System.out.println(" " + n + " Bilangan Prima"); 
		else
			System.out.println(" " + n + " Bukan Bilangan Prima"); 
	} 
	
}