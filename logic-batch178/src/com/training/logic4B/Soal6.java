package com.training.logic4B;

import java.util.Arrays;

import com.training.model.Matrix;
import com.training.utils.DeretAngka2;

public class Soal6 extends Matrix {
	
	public void setMatrix(int n) {
		this.baris = n;
		this.kolom = n*2-1;
		this.matrix = new String[this.baris][this.kolom];
		int[] data = DeretAngka2.getGanjil(n);
		System.out.println(Arrays.toString(data));
		
		//isi matrix
		for (int i = 0; i < this.baris; i++) {
			int ab = 0;
			for (int j = 0; j < this.kolom; j++) {
				if(i+j >= n-1 && j -i <= n-1) {
					this.matrix[i][j] = "" + data[ab];//ab++;
					if(j <= this.kolom /2 -1)
						ab++;
					else 
						ab--;
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
