package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int f1, f2, fn = 0;
		int cont;

		System.out.println("Digite um numero limite: ");
		int n = sc.nextInt();

		f1 = -1;
		f2 = 1;
		cont = 0;

		for (int i = 0;i<n;i++) {
			fn = f1 + f2;
			f1 = f2;
			f2 = fn;
			System.out.println(fn);
			cont = cont + 1;
		}
		
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();


		if (num == fn ||num == f1||num == f2) 		
			System.out.println("Pertence");
		else 
			System.out.println("Não pertence");

		
		sc.close();

	}

}
