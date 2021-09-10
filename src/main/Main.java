package main;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import model.InfrastructureDepartment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	Scanner sc;
	InfrastructureDepartment department;

	public static void main(String[] args) {
		Main m = new Main();

		m.getData();
		m.initialMenu();
	}

	public Main() {
		sc = new Scanner(System.in);
		department = new InfrastructureDepartment();
	}



	public void initialMenu() {

		int option = 0;

		do {

			System.out.println("Select an option please: " + "\n" + "1. Add billboard" + "\n" + "2. Show billboards"
					+ "\n" + "3. Export dangerous report" + "\n" + "0. Exit");
			
			option = sc.nextInt();
			
			switch(option) {
			
			
			case 1:
			break;
			case 2:
			break;
			case 3:
			break;
			case 0:
			break;
			
			
			
			
			
			
			}
			
			
		} while (option != 0);

	}

	
	
	public void addBillboard() {
		String billBoard="";
		System.out.println("Enter the width, height, true or false depending of it's usage and finally the name of the brad. Separate this with ++ " + "\n" +
		"For example: "+ "300++600++true++Netflix");
		billBoard = sc.nextLine();
		
		
		
		
	}
	
	
	public void showBillboard() {

		
	}
	
	public void exportReport() {

		
	}
	
	
	
	
	
	
}