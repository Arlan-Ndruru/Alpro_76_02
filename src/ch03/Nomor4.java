package ch03;
import java.util.Scanner;
public class Nomor4{
	int bil;

	public int getVarBil(){
		return bil;
	}

	public void cetak(){
		if (bil==2 || bil!=1 && bil%2!=0 ) {
			if (bil==3 || bil%3!=0) {
				if (bil==5 || bil%5!=0) {
					if (bil==7 || bil%7!=0) {
						System.out.println(bil+" Merupakan Bilangan Prima");
					}else{
						System.out.println(bil+"  Bukan Merupakan Bilangan Prima");	
					}
				}else{
					System.out.println(bil+"  Bukan Merupakan Bilangan Prima");
				}
			}else{
				System.out.println(bil+"  Bukan Merupakan Bilangan Prima");
			}
		}else{
			System.out.println(bil+"  Bukan Merupakan Bilangan Prima");
		}
	}
}