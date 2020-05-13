package ch05;
import java.util.Scanner;

public class R7B2No1_Algoritma_Euclidean{
		int m,n,r;

	public int getVarM(){
		return m;
	}
	public int getVarN(){
		return n;
	}

	public void cetak(){
		int x = m;
		int y = n;
		while(n!=0){
			r = m % n;
			m = n;
			n = r;
		}
		System.out.println(" PBB dari : ("+x+", "+y+") = "+m);
	}
}
