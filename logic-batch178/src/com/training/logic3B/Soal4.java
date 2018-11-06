package com.training.logic3B;

import java.util.Arrays;

import com.training.model.Matrix;
import com.training.utils.DeretAngka2;

public class Soal4 extends Matrix {
	
	public void setMatrix(int n) {
		this.baris = n;
		this.kolom = n;
		this.matrix = new String[this.baris][this.kolom];
		int[] data3 = DeretAngka2.getTribonaciAndReverse(n);
		System.out.println(Arrays.toString(data3));
		
		//isi matrix
		for (int i = 0; i < this.baris; i++) {
			for (int j = 0; j < this.kolom; j++) {
				this.matrix[i][j] = "*";
			}
		}
	}
	
	public static void main(String[] args) {
		Soal4 ex = new Soal4();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
