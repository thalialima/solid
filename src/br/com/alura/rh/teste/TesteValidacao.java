package br.com.alura.rh.teste;

import java.math.BigDecimal;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class TesteValidacao {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario
				("José", "000.000.000-11", Cargo.ASSISTENTE, new BigDecimal(800));
		
		System.out.println(funcionario.toString());
		
	}

}
