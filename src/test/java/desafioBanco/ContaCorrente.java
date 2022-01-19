package desafioBanco;

import desafioBanco.Cliente;
import desafioBanco.Conta;

public class ContaCorrente extends Conta {
	
	

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	
	public void imprimirExtrato() {
		System.out.println("Extrato conta corrente");
		super.imprimirInformacoesComuns();
		
	}

	

}
