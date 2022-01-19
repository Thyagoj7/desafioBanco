package desafioBanco;

import java.util.List;

import desafioBanco.Conta;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Banco {
	
	
	private String nome;
	
	private List<Conta> contas;
	
	
	

}