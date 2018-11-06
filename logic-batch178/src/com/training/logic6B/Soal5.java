package com.training.logic6B;

import com.training.model.Matrix;

public class Soal5 extends Matrix {
	
	public void setMatrix(int n) {
		this.baris = n*n;
		this.kolom = n*n;
		this.matrix = new String[this.baris][this.kolom];
		//isi matrix
		int addBangun = 0;
		int index = 1;
		int geser = n;
		int geser2 = n*2;
		for(int bangun = 0; bangun < n; bangun++) {
			for (int i = 0; i < this.baris; i++) {
				for (int j = 0; j < this.kolom; j++) {
					if(i <= n-1 && j <= n-1) {
						if(i % 2 == 0) {
							this.matrix[i+addBangun][j+geser2] = index + "";
						} else {
							this.matrix[i+addBangun][this.kolom - 1 - j - (addBangun)] = index + "";
						}
						
						index = index + 2;
					}
					//this.matrix[i][j] = "*";
				}
			}
			addBangun = addBangun + n;
			geser = geser + n;
			geser2 = geser2 - n;
		}
		
	}
	
	public static void main(String[] args) {
		Soal5 ex = new Soal5();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
