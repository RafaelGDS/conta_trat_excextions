package principal;

import java.util.Locale;
import java.util.Scanner;

import outros.Conta;
import outros.DominioException;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DADOS DA CONTA");
		System.out.print("Número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Nome do titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Saldo inicial: ");
		float saldo = sc.nextFloat();
		System.out.print("Limite de saque da conta: ");
		float limiteSaque = sc.nextFloat();
		
		Conta cont = new Conta(numero, nome, saldo, limiteSaque);
		
		System.out.println();
		System.out.print("Quanto deseja sacar? ");
		float quantia = sc.nextFloat();
		
		try {
			cont.saque(quantia);
			System.out.print("ATUALIZAÇÃO: R$ " + String.format("%.2f", cont.getSaldo()));
		}
		catch(DominioException d) {
			System.out.println("OPERAÇÃO FALHOU. " + d.getMessage());
		}
		
		sc.close();

	}

}
