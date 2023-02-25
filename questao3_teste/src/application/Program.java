package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// IMPORTANTE:
		// a) Foi usado o json como fonte dos dados do faturamento mensal;

		double[] vect = new double[30];

		vect[0] = 22174.1664;
		vect[1] = 24537.6698;
		vect[2] = 26139.6134;
		vect[3] = 0.0;
		vect[4] = 0.0;
		vect[5] = 26742.6612;
		vect[6] = 0.0;
		vect[7] = 42889.2258;
		vect[8] = 46251.174;
		vect[9] = 11191.4722;
		vect[10] = 0.0;
		vect[11] = 0.0;
		vect[12] = 3847.4823;
		vect[13] = 373.7838;
		vect[14] = 2659.7563;
		vect[15] = 48924.2448;
		vect[16] = 18419.2614;
		vect[17] = 0.0;
		vect[18] = 0.0;
		vect[19] = 35240.1826;
		vect[20] = 43829.1667;
		vect[21] = 18235.6852;
		vect[22] = 4355.0662;
		vect[23] = 13327.1025;
		vect[24] = 0.0;
		vect[25] = 0.0;
		vect[26] = 25681.8318;
		vect[27] = 1718.1221;
		vect[28] = 13220.495;
		vect[29] = 8414.61;

		double menor = Double.MAX_VALUE;

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != 0.0) {
				menor = vect[i];
			}
		}

		double maior = Double.MIN_VALUE;

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
			}
		}

		double sum = 0.0;

		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}

		double media = sum / 21;

		int cont = 0;
		for (int i = 0; i < vect.length; i++) {
			if (media < vect[i]) {
				cont++;
			}
		}

		System.out.println("O menor valor de faturamento ocorrido em um dia do mês: " + menor);
		System.out.println("O maior valor de faturamento ocorrido em um dia do mês: " + maior);
		System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: " + cont);
		sc.close();

	}

}
