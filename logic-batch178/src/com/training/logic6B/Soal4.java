package com.training.logic6B;

import com.training.model.Matrix;

public class Soal4 extends Matrix {
	
	public void setMatrix(int n) {
		this.baris = n*n;
		this.kolom = n*n;
		this.matrix = new String[this.baris][this.kolom];
		//isi matrix
		int addBangun = 0;
		int index = 1;
		int geser = n;
		for(int bangun = 0; bangun < n; bangun++) {
			for (int i = 0; i < this.baris; i++) {
				for (int j = 0; j < this.kolom; j++) {
					if(i <= n-1 && j <= n-1) {
						if(i % 2 == 0) {
							this.matrix[i+addBangun][j+addBangun] = index + "";
						} else {
							this.matrix[i+addBangun][this.kolom - 1 - j - (this.kolom-geser)] = index + "";
						}
						
						index = index + 2;
					}
					//this.matrix[i][j] = "*";
				}
			}
			addBangun = addBangun + n;
			geser = geser + n;
		}
		
	}
	
	public static void main(String[] args) {
		Soal4 ex = new Soal4();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
