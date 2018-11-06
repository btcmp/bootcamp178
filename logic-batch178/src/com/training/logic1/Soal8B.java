package com.training.logic1;

import java.util.Scanner;

public class Soal8B {
	
	public void jawab(int n) {
		int baris = n;
		int kolom = n;
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				if(j >= i && i+j <= kolom -1 || i >= j && i+j >= kolom - 1) { //segitiga atas
					System.out.print("*\t");
				}
				else{
					System.out.print("\t");
				}
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Soal8B soal = new Soal8B();
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan angka : >> ");
		int n = scan.nextInt();
		soal.jawab(n);
	}

}
