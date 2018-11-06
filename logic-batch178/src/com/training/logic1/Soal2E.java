package com.training.logic1;

import java.util.Scanner;

import com.training.model.Matrix;

public class Soal2E extends Matrix{

	public void setMatrix(int n) {
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		//isi matrix
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				if(i+j == this.kolom -1) {
					this.matrix[i][j] = "*";
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		Soal2E soale = new Soal2E();
		soale.setMatrix(soale.input());
		soale.print();
	}
}
