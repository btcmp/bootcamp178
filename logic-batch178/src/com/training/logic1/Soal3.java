package com.training.logic1;

public class Soal3 {
	
	public void jawab(int n) {
		int baris = n;
		int kolom = n;
		
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				if(i+j == kolom - 1 || i == j) {
					System.out.print("#\t");
				} 
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal3 soal = new Soal3();
		int n = 9;
		soal.jawab(n);
	}

}
