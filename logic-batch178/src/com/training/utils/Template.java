package com.training.utils;

import com.training.model.Matrix;

public class Template extends Matrix {
	
	public void setMatrix(int n) {
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		//isi matrix
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				this.matrix[i][j] = "*";
			}
		}
	}
	
	public static void main(String[] args) {
		Template ex = new Template();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
