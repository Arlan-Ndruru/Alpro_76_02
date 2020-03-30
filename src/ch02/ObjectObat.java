package ch02;
import java.util.Date;

public class ObjectObat{
	public static void main(String[]args){
		Obat x1 = new Obat();
		
		x1.barcode = "9348399348";
		x1.nama = "Paramax";
		x1.tanggalKadaluarsa = new Date(2020,10,20);
		x1.harga = 6000;
		
		Obat x2 = new Obat();
		
		x2.barcode = "9348399349";
		x2.nama = "Badrex";
		x2.tanggalKadaluarsa = new Date(2020,11,6);
		x2.harga = 7500;
		
		System.out.println(x1.nama + " (" + x1.barcode + ")");
		System.out.println("Harga: Rp" + x1.harga);
		System.out.println("Exp: " + x1.tanggalKadaluarsa.toString());
		System.out.println("=======================");
		System.out.println(x2.nama + " (" + x2.barcode + ")");
		System.out.println("Harga: Rp" + x2.harga);
		System.out.println("Exp: " + x2.tanggalKadaluarsa.toString());
		
	}

}