package com.training;

public class Contoh {
	
	//deklarasi
	//primitive varialbe //property //variable global
	double salary=4000.2;
	int age=12;
	
	//non primitive
	String name=new String("Anggi");
	String email=new String("anggi@gmail.com");
	//Contoh contoh=new Contoh();
	
	//fungsi / method
	//return
	public double getSalary() {
		//double result = 2000.0 + 4000.0;
		//double salary = 6000;
		return this.salary;
	}
	
	//main method
	public static void main(String[] args) {
		//System.out.println("hallo java application");
		Contoh contoh = new Contoh();
		Contoh contoh2 = new Contoh();
		
		contoh2.salary = 6000.0;
		System.out.println("salary : " +contoh.salary);
		System.out.println("salary : " +contoh2.salary);
		
	}

}
