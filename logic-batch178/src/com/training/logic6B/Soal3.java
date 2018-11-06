package com.training.logic6B;

import java.util.Arrays;

import com.training.model.Matrix;
import com.training.utils.DeretAngka2;

public class Soal3 extends Matrix {
	
	public void setMatrix(int n) {
		int ganjil = DeretAngka2.getLastGanjil(n);
		this.baris = n*n;
		this.kolom = ganjil*2;
		
		this.matrix = new String[this.baris][this.kolom];
		int[] dataFib = DeretAngka2.getFibonachi(n*n);
		int[] dataGanjil = DeretAngka2.getGanjil(n*n);
		System.out.println(Arrays.toString(dataFib));
		System.out.println(Arrays.toString(dataGanjil));
		
		//isi matrix
		int addBangun = 0;
		for(int bangun = 0; bangun < n; bangun++) {
			int index = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < this.kolom/2; j++) {
					if(i+j >= ((this.kolom/2)/2) && j-i <= ((this.kolom/2)/2)) {
						if(bangun % 2 == 0) {
							this.matrix[i + addBangun][j] = dataFib[index]  +"";
						} else {
							this.matrix[i + addBangun][j + this.kolom/2] = dataGanjil[index]+"";
						}
						
						index++;
					}
				}
			}
			addBangun = addBangun + n;
		}
		
	}
	
	public static void main(String[] args) {
		Soal3 ex = new Soal3();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
