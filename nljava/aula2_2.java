package nljava;

import java.util.Scanner;

public class aula2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int divisão;
		int num1;
		int num2;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		divisão = num1/num2;
		System.out.print("a divisão é: " + divisão);
		sc.close();
		
				
		
	}

}
