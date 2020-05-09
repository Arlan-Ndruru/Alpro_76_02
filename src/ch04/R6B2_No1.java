package ch04;

public class R6B2_No1{
	int[] array = {82,12,41,38,19,26,9,48,20,55,8,32,3};

	public void cetak(){
		System.out.println("Program Menampilkan Seluruh Nilai di Dalam Array : ");
		System.out.println();
		for (int i = 0; i < array.length ; i++ ) {	
			if (i==12) {
			System.out.print(array[i]+".");
			}else{
			System.out.print(array[i]+", ");
			}
		}
	}
}