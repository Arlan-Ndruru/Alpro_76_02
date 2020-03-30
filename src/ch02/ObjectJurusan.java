package ch02;

public class ObjectJurusan{
	public static void main(String[]args){
		Jurusan j1 = new Jurusan();
		Jurusan j2 = new Jurusan();
		Jurusan j3 = new Jurusan();
		
		j1.nama = "Teknik Informatika";
		j1.akreditasi = "A";
		j1.jumlahMahasiswa = 1200;
		
		j2.nama = "Sistem Informasi";
		j2.akreditasi = "A";
		j2.jumlahMahasiswa = 1090;
		
		j3.nama = "Teknik Elektro";
		j3.akreditasi = "A";
		j3.jumlahMahasiswa = 750;
		
		System.out.println("Jurusan 1");
		System.out.println("Nama : " + j1.getNama());
		System.out.println("Akreditasi : " + j1.getAkreditasi());
		System.out.println("Jumlah : " + j1.getJumlahMahasiswa());
		
		System.out.println("Jurusan 2");
		System.out.println("Nama : " + j2.getNama());
		System.out.println("Akreditasi : " + j2.getAkreditasi());
		System.out.println("Jumlah : " + j2.getJumlahMahasiswa());
		
		System.out.println("Jurusan 3");
		System.out.println("Nama : " + j3.getNama());
		System.out.println("Akreditasi : " + j3.getAkreditasi());
		System.out.println("Jumlah : " + j3.getJumlahMahasiswa());
		
		
	}
}