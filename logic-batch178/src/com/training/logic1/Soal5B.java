package com.training.logic1;

import java.util.Scanner;

public class Soal5B {

	public void jawab(int n) {
		int baris = n;
		int kolom = n;
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				if(i == j || i+j == kolom - 1 || i == 0 || j == 0 || j == kolom-1 || i == baris - 1) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
				
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Soal5B soal = new Soal5B();
		Scanner scan = new Scanner(System.in);
		System.out.print("masukkan angka : >> ");
		int n = scan.nextInt();
		soal.jawab(n);
	}
}
