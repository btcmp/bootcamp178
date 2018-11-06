package com.training.logic4B;

import com.training.model.Matrix;

public class Soal2 extends Matrix {
	
	public void setMatrix(int n) {
		this.baris = n;
		this.kolom = n*2-1;
		this.matrix = new String[this.baris][this.kolom];
		//isi matrix
		for (int i = 0; i < this.baris; i++) {
			int ab = 0;
			for (int j = 0; j < this.kolom; j++) {
				if(i-j <= 0 && i + j <= this.kolom-1) {
					this.matrix[i][j] = "" + ++ab;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Soal2 ex = new Soal2();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
