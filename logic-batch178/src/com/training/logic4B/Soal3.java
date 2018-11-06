package com.training.logic4B;

import com.training.model.Matrix;

public class Soal3 extends Matrix {
	
	public void setMatrix(int n) {
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		//isi matrix
		for (int i = 0; i < this.baris; i++) {
			int ab = 0;
			for (int j = 0; j < this.kolom; j++) {
				if(i+j >= n/2 && j -i <= n/2 && i - j <= n/2 && i +j <= this.baris + this.kolom/2-1) {
					this.matrix[i][j] = "" + ++ab;
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		Soal3 ex = new Soal3();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
