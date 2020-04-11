package ch03;
import java.util.Scanner;

public class Nomor1{
	int x,y;

	public int getVarX(){
		return x;
	}
	public int getVarY(){
		return y;
	}
	public void cetak(){
		if (x>y) {
			System.out.println("Nilai Bilangan X yaitu "+x+" Lebih Besar daripada Nilai Bilangan Y yaitu "+y);
		}else{
			System.out.println("Nilai Bilangan Y yaitu "+y+" Lebih Besar daripada Nilai Bilangan X yaitu "+x);
		}
	}	
}