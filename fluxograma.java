package atividades;
import java.util.Scanner;

public class fluxograma {

	public static void main(String[] args) {
		// Variáveis
		double horatrab,valorhora,salbruto,sallíquido,inss;
		//Instaciar classe Scanner
		Scanner ler = new Scanner (System.in);

		//Entrada de dados
		System.out.println ("Informe sua hora de trabalho: ");
		horatrab = ler.nextDouble();

		System.out.println("Informe o valor da sua hora: ");
		valorhora = ler.nextDouble();

		//Processamento
		salbruto = horatrab*valorhora;
		inss = salbruto*0.12;
		sallíquido = salbruto-inss;


		//Saída
		System.out.println("O valor do salário bruto é: " + salbruto);
		System.out.println("O valor do salário liquído é :" + sallíquido);
		ler.close();


	}

}
