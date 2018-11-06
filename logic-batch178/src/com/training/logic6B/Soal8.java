package com.training.logic6B;

import com.training.model.Matrix;

public class Soal8 extends Matrix {
	
	public int getStartFrom(int n) { //3
		int result = 0;
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 1) {
				result++;		//1,2
			}
		}
		
		return result;
	}
	
	public void setMatrix(int n) {
		this.baris = n*n;
		this.kolom = n*n;
		this.matrix = new String[this.baris][this.kolom];
		int awal = getStartFrom(n);
		System.out.println("start from "+ awal);
		//isi matrix
		int addBangun = 0;
		int index = awal;
		for(int bangun = 0; bangun < n; bangun++) {
			for (int i = 0; i < n; i++) {
				int descrease = 0;
				for (int j = 0; j < n; j++) {
					if(i+j >= n /2 && j -i <= n/2 && i -j <= n/2 && i+j <= ((n)+n/2)-1) {
						this.matrix[i+addBangun][j+addBangun] = (index-descrease) + "";
						if(j <= n/2 -1) {
							descrease++;
						} else {
							descrease--;
						}
					}
				}
			}
			addBangun = addBangun + n;
			index = index + awal;
		}
		
	}
	
	public static void main(String[] args) {
		Soal8 ex = new Soal8();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
