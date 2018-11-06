package com.training.extra2;

import com.training.model.Matrix;

public class Extra1D extends Matrix {
	
	public void setMatrix(int n) {
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		//isi matrix
		int ab = 0;
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				this.matrix[i][j] = "" + ab;
				ab++;
			}
		}
	}
	
	public static void main(String[] args) {
		Extra1D ex = new Extra1D();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
