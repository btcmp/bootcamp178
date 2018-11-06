package com.training.logic6B;

import com.training.model.Matrix;

public class Soal9 extends Matrix {
	
	public int getMaxColumn(int n) {
		
		int hasil = 0;
		int loop = 3;
		for(int i = 1; i <= n; i++) {
			hasil = hasil + loop;
			loop++;
		}
		return hasil;
	}
	
	public void setMatrix(int n) {
		System.out.println("hasil max column : "+ getMaxColumn(n));
		this.baris = n+2;
		this.kolom =  getMaxColumn(n);
		this.matrix = new String[this.baris][this.kolom];
		//isi matrix
		int addBangun = 0;
		int turun = n - 1;
		int angka = 1;
		for(int bangun = 0; bangun < n; bangun++) {
			for (int i = 0; i < 3+bangun; i++) {
				for (int j = 0; j < 3+bangun; j++) {
					if(i + j == 2+bangun || j == 2+bangun || i == 2+bangun) {
						this.matrix[i+turun][j+addBangun] = (angka + addBangun + j)+"";
					}
					
				}
			}
			turun--;
			addBangun = addBangun + bangun + 3;
		}
		
	}
	
	public static void main(String[] args) {
		Soal9 ex = new Soal9();
		ex.setMatrix(ex.input());
		ex.print();
		
	}

}
