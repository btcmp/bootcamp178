package com.training.extra2;

import com.training.model.Matrix;

public class Extra1B extends Matrix {
	
	public void setMatrix(int n) {
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		//isi matrix
		int a = 0;
		for (int i = 0; i < this.baris; i++) {
			
			int ab = 0;
			for (int j = 0; j < this.kolom; j++) {
				this.matrix[i][j] = "" + ab;
				ab = ab + 1;
			}
			
			a++;
		}
	}
	
	public static void main(String[] args) {
		Extra1B ex = new Extra1B();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
