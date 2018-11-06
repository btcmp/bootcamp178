package com.training.logic1;

public class Soal2 {

	public void jawab(int n) {
		int baris = n;
		int kolom = n;
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				if(i + j == kolom -1) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal2 soal = new Soal2();
		int n = 9;
		soal.jawab(n);
	}
	
}
