package com.training.teory;

public class MyArray {

	public void test() {
		
		String[] data = new String[3];
		
		data[0] = "Jakarta";
		data[1]	= "Ambon";
		data[2] = "Bengkulu";
		
		for(int i = 0; i < data.length; i++) {
			System.out.println("index : "+ i + ", value : " + data[i]);
		}
		
		System.out.println("==== contoh 2 ======");
		
		int bil[] = new int[3];
		bil[0] = 3;
		bil[1] = 4;
		bil[2] = 7;
		//bil[3] = 8; 
		
		for(int i = 0; i < bil.length; i++) {
			System.out.println("index : "+ i + ", value : " + bil[i]);
		}
		
		System.out.println("MULTIDIMENSIONAL ARRAY (2D)");
		//MATRIX
		int kolom = 3;
		int baris = 2;
		
		String[][] data2D = new String[baris][kolom];
		data2D[0][0] = "2";
		data2D[0][1] = "4";
		data2D[0][2] = "6";
		data2D[1][0] = "8";
		data2D[1][1] = "10";
		data2D[1][2] = "12";
		
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				System.out.print(data2D[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		MyArray ma = new MyArray();
		ma.test();
	}
}
