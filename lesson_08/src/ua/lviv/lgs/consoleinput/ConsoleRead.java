package ua.lviv.lgs.consoleinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleRead {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//runScanner();
		//calculate();
		runReader();

	}
	
	public static void runScanner() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number: ");

		double number = scanner.nextDouble();

		if(number % 1 ==0) {
			System.out.println("Integer number/целое ");

			if(number % 2 ==0) {
				System.out.println("Paired number/ парне ");
			}else {
				System.out.println("Not paired number/ не парне ");
			}

		}else {
			System.out.println("Not Integer number/ не целое  ");
		}
	}
	
	
	public static void calculate() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number: ");

		double number1 = scanner.nextDouble();

		System.out.println("Enter second number: ");

		double number2 = scanner.nextDouble();
		
		System.out.println("Sum is equel : " + (number1 + number2));
	}
	
	
	public static void runReader() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number: ");

		double number = Double.parseDouble(br.readLine());

		if(number % 1 ==0) {
			System.out.println("Integer number/целое ");

			if(number % 2 ==0) {
				System.out.println("Paired number/ парне ");
			}else {
				System.out.println("Not paired number/ не парне ");
			}

		}else {
			System.out.println("Not Integer number/ не целое  ");
		}
		
		
	}

}



