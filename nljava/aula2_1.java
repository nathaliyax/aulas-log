package nljava;

import java.util.Scanner;

public class aula2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto = sc.next();
		int num1;

		num1 = sc.nextInt();
		System.out.print(texto + " " + num1);
		sc.close();
	}

}
