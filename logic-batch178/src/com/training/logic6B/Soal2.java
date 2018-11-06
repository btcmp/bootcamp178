package com.training.logic6B;

import com.training.model.Matrix;
import com.training.utils.DeretAngka2;

public class Soal2 extends Matrix {
	
	public void setMatrix(int n) {
		this.baris = n*n;
		this.kolom = (n*2-1)*2;
		this.matrix = new String[this.baris][this.kolom];
		int[] dataFib = DeretAngka2.getFibonachi(n*n);
		//isi matrix
		int addBangun = 0;
		for(int bangun = 0; bangun < n; bangun++) {
			int index = 0;
			for (int i = 0; i < this.baris; i++) {
				for (int j = 0; j < this.kolom; j++) {
					if(i+j >= n-1 && j -i <= n-1 && i <= n-1) {
						if(bangun % 2 == 0) {
							this.matrix[i + addBangun][j] = dataFib[index] + "";
						} else {
							this.matrix[i + addBangun][j + (n*2-1) ] = dataFib[index] +"";
						}
						index++;
					}
				}
			}
			addBangun = addBangun + n;
		}
		
	}
	
	public static void main(String[] args) {
		Soal2 ex = new Soal2();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
