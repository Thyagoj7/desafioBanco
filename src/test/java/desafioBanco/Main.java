package desafioBanco;

import java.util.Scanner;

import desafioBanco.Cliente;
import desafioBanco.Conta;
import desafioBanco.ContaCorrente;
import desafioBanco.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente user = new Cliente();
		//venilton.setNome("venilton");
		String umnome = "";
		
		Scanner scan = new Scanner(System.in);
		umnome = scan.next();
		
		
		
		String chara = Cliente.vetoriano(umnome);
		user.setNome(chara);
		
		Conta cc = new ContaCorrente(user);
		Conta cp = new ContaPoupanca(user);
		
		//System.out.println("Deseja fazer um deposito? Selcione 1 para sim e 2 para não");
		
		
		cc.depositar(300);
		
		cc.trasnferir(300, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}



}

