package ch04;
import java.util.Scanner;
public class R6B2_No2{
	int[] array = {82,12,41,38,19,26,9,48,20,55,8,32,3};
	int angka;
	boolean found = false;
public void cetak(){

	for (int i = 0; i < array.length ; i++ ) {	
			
			System.out.print(array[i]+" . ");
			
		}
		

	}
public void cetak2(){
	for (int i = 0; i < array.length ; i++ ) {	
			
			if (array[i]==angka) {
				found = true;
				int z = i;
				System.out.print("Data Ditemukan di index ke-"+z);	
			}
		
			
		}
		if(found == false){
			System.out.print("Data Tidak Ditemukan");
		}
}
}