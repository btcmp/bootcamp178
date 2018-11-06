package com.training.logic1;

import java.util.Scanner;

import com.training.model.Matrix;

public class Soal1E extends Matrix{
	
	public void setMatrix(int n) {
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		//isi matrix
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				if(i -j == 0) {
					this.matrix[i][j] = "*";
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Soal1E soale = new Soal1E();
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan angka : >> ");
		int n = scan.nextInt();
		soale.setMatrix(n);
		soale.print();
	}
}
