package com.training.logic1;

public class Soal1Z {
	
	public void jawab(int n) { //n=>9 //parameter
		System.out.println("n : "+ n);
		int kolom = n;
		int baris = n;
		
		for(int i = 0; i < baris; i++) {
			for(int j = 0; j < kolom; j++) {
				if(+i -j == 0) {
					System.out.print("*\t");
				} if(+i -j == 2) {
					System.out.print("@\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal1Z soal = new Soal1Z();
		int n = 9; 
		soal.jawab(n); //argument
	}

}

//kolom = kesamping = x = column = horizontal = j
//baris = kebawah = y = row = vertical = i
