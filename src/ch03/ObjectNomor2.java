package ch03;
import java.util.Scanner;
public class ObjectNomor2{
	public static void main(String[]args){
		Nomor2 bil = new Nomor2();
		System.out.println(" Program menentukan Nilai tertinggi dari X,Y dan Z ");
		System.out.println();

		Scanner a = new Scanner (System.in);
		System.out.print(" Masukkan Nilai Bilangan X : ");
		bil.x = a.nextInt();
		
		Scanner b = new Scanner (System.in);
		System.out.print(" Masukkan Nilai Bilangan Y : ");
		bil.y = b.nextInt();

		Scanner c = new Scanner (System.in);
		System.out.print(" Masukkan Nilai Bilangan Z : ");
		bil.z = c.nextInt();
		
		bil.cetak();
		
	}
}