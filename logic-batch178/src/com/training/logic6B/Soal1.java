package com.training.logic6B;

import com.training.model.Matrix;
import com.training.utils.DeretAngka2;

public class Soal1 extends Matrix {
	
	public void setMatrix(int n) {
		int ganjil = DeretAngka2.getLastGanjil(n);
		this.baris = n*n;
		this.kolom = ganjil*2;
		
		this.matrix = new String[this.baris][this.kolom];
		//isi matrix
		int addBangun = 0;
		for(int bangun = 0; bangun < n; bangun++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < this.kolom/2; j++) {
					if(i+j >= ((this.kolom/2)/2) && j-i <= ((this.kolom/2)/2)) {
						if(bangun % 2 == 0) {
							this.matrix[i + addBangun][j] = "*";
						} else {
							this.matrix[i + addBangun][j + this.kolom/2] = "#";
						}
						
						
					}
				}
			}
			addBangun = addBangun + n;
		}
		
	}
	
	public static void main(String[] args) {
		Soal1 ex = new Soal1();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
