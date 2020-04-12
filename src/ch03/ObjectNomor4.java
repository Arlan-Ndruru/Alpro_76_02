package ch03;
import java.util.Scanner;
public class ObjectNomor4{
	public static void main(String[] args) {
		Nomor4 prima = new Nomor4();

		System.out.println(" Program Menentuan Bilangan Prima atau Tidak ");
		System.out.println();

		Scanner bilangan_yang_dites = new Scanner (System.in);
		System.out.print(" Masukkan Angka Yang Ingin di Tes : ");
		prima.bil = bilangan_yang_dites.nextInt();

		prima.cetak();

	}
}