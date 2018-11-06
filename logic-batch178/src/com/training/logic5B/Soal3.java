package com.training.logic5B;

import com.training.model.Matrix;
import com.training.utils.DeretAngka2;

public class Soal3 extends Matrix {
	
	public void setMatrix(int n) {
		//System.out.println("hasil : "+ DeretAngka2.getLastTriangular(n));
		this.baris = DeretAngka2.getLastTriangular(n);
		this.kolom = DeretAngka2.getLastPangkat(n);
		this.matrix = new String[this.baris][this.kolom];
		
		int[] inc = DeretAngka2.getIncrement(n);//{1, 2, 3};
		int[] inc2 = DeretAngka2.getGanjil(n);//{1, 3, 5, 7};
		int[] geser = DeretAngka2.getTriangular(n);
		int[] geser2 = DeretAngka2.getPangkat(n);//{0,1,4,9};
		//isi matrix
		//int addBangun=1;
		for(int bangun = 0; bangun < n; bangun++) {
			for (int i = 0; i < inc[bangun]; i++) {
				for (int j = 0; j < inc2[bangun]; j++) {
					if(i+j >= bangun && j-i <= bangun) {
						this.matrix[i+geser[bangun]][j+geser2[bangun]] = "*";
					}
					
				}
			}
			//addBangun = addBangun + 1;
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
		Soal3 ex = new Soal3();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
