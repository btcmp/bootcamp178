package com.training.model;

import java.util.Scanner;

public class Matrix {
	
	public int baris;
	public int kolom;
	public String[][] matrix;
	
	public void print() {
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				System.out.print(this.matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public int input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("masukkan angka : >> ");
		return scan.nextInt();
	}

}
