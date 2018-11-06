package com.training.extra2;

import com.training.model.Matrix;

public class Extra2B extends Matrix {
	
	public void setMatrix(int n) {
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		//isi matrix
		
		for (int i = 0; i < this.baris; i++) {
			int ab = n-1;
			for (int j = 0; j < this.kolom; j++) {
				this.matrix[i][j] = "" + ab;
				ab--;
			}
			
		}
	}
	
	public static void main(String[] args) {
		Extra2B ex = new Extra2B();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
