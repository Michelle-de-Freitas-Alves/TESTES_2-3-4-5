package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entrar com um string: ");
		String word = sc.nextLine();

		String inverte = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			inverte += word.charAt(i);
		}
		System.out.println();
		System.out.println("Caracteres invertidos de um string : " + inverte);
		sc.close();

	}
}
