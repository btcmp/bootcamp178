package com.training.logic5B;

import com.training.model.Matrix;
import com.training.utils.DeretAngka2;

public class Soal6 extends Matrix {
	
	public void setMatrix(int n) {
		//System.out.println("hasil : "+ DeretAngka2.getLastTriangular(n));
		this.baris = DeretAngka2.getLastTriangular(n);
		this.kolom = DeretAngka2.getLastTriangular(n);
		this.matrix = new String[this.baris][this.kolom];
		
		int[] inc = DeretAngka2.getIncrement(n);//{1, 2, 3};
		int[] geser = DeretAngka2.getTriangular(n+1);
		//isi matrix
		//int addBangun=1;
		int addBangun = 0;
		for(int bangun = 0; bangun < n; bangun++) {
			int index = 1;
			int temp = 1;
			for (int i = 0; i < inc[bangun]; i++) {
				for (int j = 0; j < inc[bangun]; j++) {
					this.matrix[i+geser[bangun]][j + this.kolom-geser[bangun+1]] = 
														index + "";
					index++;
				}
				temp = temp + (addBangun+1);
			}
			System.out.println(addBangun+1);
			addBangun = addBangun + 1;
		}
		
//		for (int i = 0; i < 1; i++) {
//			for (int j = 0; j < 1; j++) {
//				this.matrix[i+0][j+0] = "*";
//			}
//		}
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				this.matrix[i+1][j+1] = "*";
//			}
//		}
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				this.matrix[i+3][j+3] = "*";
//			}
//		}
	}
	
	public static void main(String[] args) {
		Soal6 ex = new Soal6();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
