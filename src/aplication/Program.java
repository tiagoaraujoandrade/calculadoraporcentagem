package aplication;
import java.util.Locale;
import java.util.Scanner;

//importar java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double taxa, valorRecebido, valorOlx;
		System.out.println("Insira o valor da taxa: (exemplo 0.1) ");
		taxa = sc.nextDouble();
		System.out.println("Insira o valor que deseja receber do comprador: ");
		valorRecebido = sc.nextDouble();

		valorOlx = (valorRecebido / (1 - taxa));

		System.out.println("Valor a anunciar: " + valorOlx);

		sc.close();
	}
}
