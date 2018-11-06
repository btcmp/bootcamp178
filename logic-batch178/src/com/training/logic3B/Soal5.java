package com.training.logic3B;

import java.util.Arrays;

import com.training.model.Matrix;
import com.training.utils.DeretAngka2;

public class Soal5 extends Matrix {
	
	public void setMatrix(int n) {
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		int[] dataFib = DeretAngka2.getFibonachiAndReverse(n);
		System.out.println(Arrays.toString(dataFib));
		
		//isi matrix
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				if(i -j <= 0 || i + j >= n - 1) {
					this.matrix[i][j] = "" + dataFib[j];
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		Soal5 ex = new Soal5();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
