package com.training.utils;

import java.util.Arrays;

public class DeretAngka2 {

	//1) output : 1,2,3,4.. 
	public static int[] getIncrement(int n) {
		int[] data = new int[n];
		
		for(int i = 0; i < n; i++) {
			data[i] = i +1;
		}
		return data;
	}
	
	//output : 1, ,3, ,5, ,6, etc
	public static String[] getIncrementWithEmpty(int n) {
		String[] data = new String[n];
		
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				data[i] = (i+1) + "" ;
			} else {
				data[i] = " ";
			}
			
		}
		return data;
	}
	
	//5) 1,1,2,3,5..
	public static int[] getFibonachi(int n) {
		int[] data = new int[n];
		data[0] = 1;
		data[1] = 1;
		
		for(int i = 2; i < n; i++) {
			data[i] = data[i - 1] + data[i - 2];
		}
		return data;
	}
	
	
	//output : 1,1,1,3,5,9..
	public static int[] getTribonachi(int n) {
		int[] data = new int[n];
		data[0] = 1;
		data[1] = 1;
		data[2] = 1;
		
		for(int i = 3; i < n; i++) {
			data[i] = data[i - 1] + data[i - 2] + data[i - 3];
		}
		return data;
	}
	
	public static int[] getTribonaciAndReverse(int n) {
		int[] dataFib = getTribonachi(n);
		int[] hasil = new int[n];
		
		for(int i = 0; i < dataFib.length; i++) {
			if(i <= n/2) {
				hasil[i] = dataFib[i];
			} else {
				hasil[i] = dataFib[n-i-1];
			}	
		}
		
		return hasil;
	}
	
	//7A2. output : 1,1,2,1,1..
	public static int[] getFibonachiAndReverse(int n) {
		int[] dataFib = getFibonachi(n);
		int[] hasil = new int[n];
		
		for(int i = 0; i < dataFib.length; i++) {
			if(i <= n/2) {
				hasil[i] = dataFib[i];
			} else {
				hasil[i] = dataFib[n-i-1];
			}	
		}
		
		return hasil;
	}
	
	//output : 1, ,1, ,2, ,1, ,1.. 
	public static String[] getFRwithEmpty(int n) {
		int[] data = getFibonachi(n);
		String[] hasil = new String[n];
		int index = 0;
		for(int i = 0; i < data.length; i++) {
			if(i % 2 == 0) {
				hasil[i] = String.valueOf(data[index]);
				if(i <= n/2-1) {
					index++;
				} else {
					index--;
				}
			} else {
				hasil[i] = " ";
			}
		}
		return hasil;
	}
	
	public static int[] getGanjil(int n) {
		int[] data = new int[n];
		
		int index = 1;
		for(int i = 0; i < n; i++) {
			data[i] = index;
			index = index + 2;
		}
		return data;
	}
	
	//1,A,1,B,2,C...
	public static String[] getFRwithAbjad(int n) {
		int[] data = getFibonachi(n);
		String[] dataAbjad = getAbjads(n);
		
		String[] hasil = new String[n];
		int index = 0;
		int index2 = 0;
		for(int i = 0; i < data.length; i++) {
			if(i % 2 == 0) {
				hasil[i] = data[index++]+"";
			} else {
				hasil[i] = dataAbjad[index2++]+"";
			}
		}
		
		return hasil;
	}
	
	//output: n = 5; 1,1,2,1,1 => 1
	public static int getLastFibAndReverse(int n) {
		int[] fib = getFibonachi(n);
		//1, 1, 2, 1, 1
		int hasil = 0;
		for(int i = 0; i < n; i++) {
			hasil = fib[i];
		}
		return hasil;
	}
	
	//19. abjads 
	public static String[] getAbjads(int n) {
		String[] data = {
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"	
		};
		String[] result = new String[n];
		for(int i = 0; i < n; i++) {
			result[i] = data[i];
		}
		
		return result;
	}
	
	//11. menghitung bilangan akhir ganjil
	// 1, 3, 5...
	public static int getLastGanjil(int n) {
		int hasil = 0;
		int index = 1;
			for(int i = 0; i < n; i++) {
				hasil = index;
				index = index + 2;
			}
			
		return hasil;
	}
	
	public static int getLastTriangular(int n) {
		int result = 0;
		int index = 1;
		for(int i = 0; i < n; i++) {
			result = result + index; 
			index++;
		}
		
		return result;
		/*
		 0 + 1 = 1
		 1 + 2 = 3
		 3 + 3 = 6
		 6 + 4 = 10 
		 * */
	}
	
	public static int[] getTriangular(int n) {
		int[] data = new int[n];
		int result = 0;
		int index = 0;
		for(int i = 0; i < n; i++) {
			result = result + index; 
			data[i] = result;
			index++;
		}
		
		return data;
		/*
		 0 + 0 = 0
		 0 + 1 = 1
		 1 + 2 = 3
		 3 + 3 = 6
		 6 + 4 = 10 
		 * */
	}
	
	public static int getLastPangkat(int n) {
		return n*n;
	}
	
	public static int[] getPangkat(int n) {
		// TODO Auto-generated method stub
		int[] data = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = i * i;
		}
		
		return data;
	}

	
	public static void main(String[] args) {
		int[] data = getIncrement(5);
		int[] dataFib = getFibonachi(5);
		int[] dataFibAndReverse = getFibonachiAndReverse(11);
		int lastFibAndReverse = getLastFibAndReverse(5);
		String[] dataA = getIncrementWithEmpty(9);
		String[] dataB = getFRwithEmpty(9);
		String[] dataC = getFRwithAbjad(11);
		System.out.println(Arrays.toString(dataC));
		System.out.println(Arrays.toString(dataB));
		System.out.println(""+ Arrays.toString(dataA));
		System.out.println("12. hasil : "+ lastFibAndReverse);
		System.out.println("7A2. fib dan kebalik : "+ Arrays.toString(dataFibAndReverse));
		String[] dataAbjad = getAbjads(3);
		System.out.println("11. hitung ganjil : "+ getLastGanjil(5));
		System.out.println("1. hasil increment : "+  Arrays.toString(data));
		System.out.println("5. hasil fibonachi : "+ Arrays.toString(dataFib));
		System.out.println("19. hasil abjad : "+ Arrays.toString(dataAbjad));
	}

	
	
}
