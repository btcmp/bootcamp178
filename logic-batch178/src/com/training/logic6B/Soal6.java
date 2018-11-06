package com.training.logic6B;

import com.training.model.Matrix;

public class Soal6 extends Matrix {
	
	public void setMatrix(int n) {
		this.baris = n*n;
		this.kolom = n*n;
		this.matrix = new String[this.baris][this.kolom];
		//isi matrix
		int addBangun = 0;
		for(int bangun = 0; bangun < n; bangun++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if(i+j >= n /2 && j -i <= n/2 && i -j <= n/2 && i+j <= ((n)+n/2)-1) {
						this.matrix[i+addBangun][j+addBangun] = "*";
					}
					
				}
			}
			addBangun = addBangun + n;
		}
		
	}
	
	public static void main(String[] args) {
		Soal6 ex = new Soal6();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
