package br.com.alura.rh.teste;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.service.ReajusteService;
import br.com.alura.rh.service.ValidacaoPercentualReajuste;
import br.com.alura.rh.service.ValidacaoPeriodiciadadeEntreReajustes;
import br.com.alura.rh.service.ValidacaoReajuste;

public class TesteValidacao {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("José", "000.000.000-11", Cargo.ASSISTENTE, new BigDecimal(800));

		System.out.println(funcionario.toString());

		List<ValidacaoReajuste> validacoes = Arrays.asList(
				new ValidacaoPeriodiciadadeEntreReajustes(),
				new ValidacaoPercentualReajuste()
				);

		ReajusteService reajusteService = new ReajusteService(validacoes);

		reajusteService.reajustarSalarioDoFuncionario(funcionario, new BigDecimal(100));
		
		System.out.println("\nSalário ajustado");
		System.out.println(funcionario.toString());
	}

}
