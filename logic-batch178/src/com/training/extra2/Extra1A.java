package com.training.extra2;

import com.training.model.Matrix;

public class Extra1A extends Matrix {
	
	public void setMatrix(int n) {
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		//isi matrix
		int a = 0;
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				this.matrix[i][j] = "" + a;
			}
			
			a++;
		}
	}
	
	public static void main(String[] args) {
		Extra1A ex = new Extra1A();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
