package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double SP = 67836.43;
		double RJ = 36678.66;
		double MG = 29229.88;
		double ES = 27165.48;
		double outros = 19849.53;

		System.out.println("Valor de faturamento mensal de uma distribuidora: ");
		System.out.println("SP – R$67.836,43");
		System.out.println("RJ – R$36.678,66");
		System.out.println("MG – R$29.229,88");
		System.out.println("ES – R$27.165,48");
		System.out.println("Outros – R$19.849,53");
		System.out.println();
		System.out.println("Total - 180.759,98");
		System.out.println();

		System.out.println("Valores em porcentagem: ");
		double total = SP + RJ + MG + ES + outros;

		System.out.println();
		double resultsp = SP * 100 / total;
		System.out.printf(" O percentual de representação de São Paulo foi de = %.2f%%%n ", resultsp);

		double resultrj = RJ * 100 / total;
		System.out.printf("O percentual de representação de Rio de janeiro foi de = %.2f%%%n ", resultrj);

		double resultmg = MG * 100 / total;
		System.out.printf("O percentual de representação de Minas Gerais foi de = %.2f%%%n ", resultmg);

		double resultes = ES * 100 / total;
		System.out.printf("O percentual de representação de Espirito Santo foi de = %.2f%%%n ", resultes);

		double resultoutros = outros * 100 / total;
		System.out.printf("O percentual de representação de outros foi de = %.2f%%%n ", resultoutros);

		sc.close();

	}

}
