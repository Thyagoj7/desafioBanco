package desafioBanco;

import desafioBanco.Cliente;
import desafioBanco.Conta;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	public void imprimirExtrato() {
		System.out.println("Extrato conta Poupanca");
		super.imprimirInformacoesComuns();
	}
	
}
