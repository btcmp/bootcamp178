package com.training.extra2;

import com.training.model.Matrix;

public class Extra2E extends Matrix {
	
	public void setMatrix(int n) {
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		//isi matrix
		int ab = (n-1) * n;
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				this.matrix[i][j] = "" + (ab+j);
			}
			ab = ab - n;
		}
	}
	
	public static void main(String[] args) {
		Extra2E ex = new Extra2E();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
