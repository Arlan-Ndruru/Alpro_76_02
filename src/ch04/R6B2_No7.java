package ch04;
import java.util.Scanner;
public class R6B2_No7{
	int[] array = {82,12,41,38,19,26,9,48,20,55,8,32,3};

	public void cetak(){
		for (int i = 9; i < array.length ; i++ ) {	
			
			if (array[i]%5==0) {
				System.out.print(array[i]+" , ");
			}
			
		}
	}

}