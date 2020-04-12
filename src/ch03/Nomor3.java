package ch03;
import java.util.Scanner;

public class Nomor3{
	int a=3;
	int bil;
	int terkecil;

	public int getVarBil(){
		return bil;
	}

	public void cetak(){
		while(a<=bil){
			if (bil%a==0) {
				terkecil=a;
            	System.out.println(terkecil+" Adalah Pembagi terkecil dari "+bil);
            	break;
			}else{
				a=a+1;
                	if(bil%a==0){
                		terkecil=a;
                		System.out.println(terkecil+" Adalah Pembagi terkecil dari "+bil);
						break;
				}
			}a++;
		}
	}
}