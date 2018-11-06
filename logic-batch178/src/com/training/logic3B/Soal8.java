package com.training.logic3B;

import java.util.Arrays;

import com.training.model.Matrix;
import com.training.utils.DeretAngka2;

public class Soal8 extends Matrix {
	
	public void setMatrix(int n) {
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		String[] dataFib = DeretAngka2.getIncrementWithEmpty(n);
		System.out.println(Arrays.toString(dataFib));
		
		//isi matrix
		int abc = n-1;
		for (int i = 0; i < this.baris; i++) {
			int ab = n - 1;
			for (int j = 0; j < this.kolom; j++) {
				 if(i - j <= 0 && i + j <= n - 1) {
					this.matrix[i][j] ="" + dataFib[i];
				} else if(i + j >= n - 1 && i -j <= 0) {
					this.matrix[i][j] ="" + dataFib[(ab - j)];
				} else if(i + j >= n - 1) {
					this.matrix[i][j] ="" + dataFib[(abc-i)];
				} else {
					this.matrix[i][j] ="" + dataFib[j];
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		Soal8 ex = new Soal8();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
