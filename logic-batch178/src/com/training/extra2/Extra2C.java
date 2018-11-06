package com.training.extra2;

import com.training.model.Matrix;

public class Extra2C extends Matrix {
	
	public void setMatrix(int n) {
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		//isi matrix
		int ab = 0;
		for (int i = 0; i < this.baris; i++) {
			int abc = 0;
			for (int j = 0; j < this.kolom; j++) {
				if(i -j >= 0) {
					this.matrix[i][j] = "" + (ab-abc);
				}
				
				abc++;
			}
			ab++;
		}
	}
	
	public static void main(String[] args) {
		Extra2C ex = new Extra2C();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
