package ch02;

public class ObjectTrapesium{
	public static void main(String[]args){
		Trapesium trapesium = new Trapesium();
		trapesium.alasBawah = 25;
		trapesium.alasAtas = 18;
		trapesium.tinggi = 12;
		System.out.println("Luas = "+ trapesium.luas());
	}
}