package ch02;
import java.util.Date;

public class ObjectProduk{
	public static void main(String[]args){
		Produk x1 = new Produk();
		
		x1.barcode = "423332223";
		x1.nama = "Pepsident";
		x1.tanggalKadaluarsa = new Date(2021,7,2);
		x1.harga = 8000;
		
		Produk x2 = new Produk();
		
		x2.barcode = "5122211121";
		x2.nama = "KatKit";
		x2.tanggalKadaluarsa = new Date(2021,1,21);
		x2.harga = 14500;
		
		System.out.println(x1.nama + " (" + x1.barcode + ")");
		System.out.println("Harga: Rp" + x1.harga);
		System.out.println("Exp: " + x1.tanggalKadaluarsa.toString());
		System.out.println("=======================");
		System.out.println(x2.nama + " (" + x2.barcode + ")");
		System.out.println("Harga: Rp" + x2.harga);
		System.out.println("Exp: " + x2.tanggalKadaluarsa.toString());
		
	}

}