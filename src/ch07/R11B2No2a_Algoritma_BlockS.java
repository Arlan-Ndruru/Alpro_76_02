package ch07;

public class R11B2No2a_Algoritma_BlockS {
	int [] arr = new int [] {82,12,41,38,19,26,9,48,20,55,8,32,3};     
    int temp = 0;

    public void cetak(){
    	System.out.print(" Array Yang Diinput : ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + ", ");    
        }    
            
            
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
            
        System.out.println();    
                
        System.out.print("\n Urutan Array Setelah Di Block Sort : ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + ", ");    
        }
        	System.out.println();    
    }
}