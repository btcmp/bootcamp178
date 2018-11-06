package com.training.logic1;

public class Soal4B {

	public void jawab(int n) {
		int baris = n;
		int kolom = n;
		
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				if(i == j) { //diagonal 1
					System.out.print("*\t");
				} else if(i+j == kolom -1) { //diagonal 2 
					System.out.print("#\t");
				} else if(j == kolom /2) { // garis tengah kolom
					System.out.print("@\t");
				} else if(i == baris /2){ // garis tengah baris
					System.out.print("%\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal4B soal = new Soal4B();
		int n = 9;
		soal.jawab(n);
	}
}
