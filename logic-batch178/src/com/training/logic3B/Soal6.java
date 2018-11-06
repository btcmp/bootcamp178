package com.training.logic3B;

import java.util.Arrays;

import com.training.model.Matrix;
import com.training.utils.DeretAngka2;

public class Soal6 extends Matrix {
	
	public void setMatrix(int n) {
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		int[] dataFib = DeretAngka2.getFibonachi(n);
		System.out.println(Arrays.toString(dataFib));
		
		//isi matrix
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				if(i - j == 0) {
					this.matrix[i][j] = "" + dataFib[i];
				} else if(i+j == n - 1) {
					this.matrix[i][j] = "" + dataFib[j];
				} else if(i - j <= 0 && i + j <= n - 1) {
					this.matrix[i][j] ="A";
				} else if(i + j >= n - 1 && i -j <= 0) {
					this.matrix[i][j] ="B";
				} else if(i + j >= n - 1) {
					this.matrix[i][j] ="C";
				} else {
					this.matrix[i][j] ="D";
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		Soal6 ex = new Soal6();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
