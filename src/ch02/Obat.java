package ch02;
import java.util.Date;
public class Obat{

	String barcode;
	String nama;
	Date tanggalKadaluarsa;
	double harga;
	
	public String getBarcode(){
		return barcode;
	}
	public String getNama(){
		return nama;
	}
	public Date getTanggalKadaluarsa(){
		return tanggalKadaluarsa;
	}
	public double getHarga(){
		return harga;
	}
	
}