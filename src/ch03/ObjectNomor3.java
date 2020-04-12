package ch03;
import java.util.Scanner;

public class ObjectNomor3{
	public static void main(String[] args) {
		Nomor3 pembagi = new Nomor3();

		Scanner bil = new Scanner (System.in);
		System.out.println(" Program menentukan Pembagi terkecil selain 1 dan 2 ");
		System.out.println();
		System.out.print(" Masukkan Bilangan yang Ingin diketahui Pembagi Terkecilnya : ");
		pembagi.bil = bil.nextInt();

		pembagi.cetak();
	}
}