package br.com.alura.rh.service.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class promocaoService {

	public void promover(Funcionario funcionario, boolean metaBatida) {
		
		if (funcionario.getDadosPessoais().getCargo() == Cargo.GERENTE)
			throw new ValidacaoException("Esse cargo não pode ser promovido");
		
		Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();
		
		if(!metaBatida) {
			throw new ValidacaoException("O funcionário não bateu a meta!");
		}
		Cargo novoCargo = cargoAtual.proximoCargo();
		funcionario.promover(novoCargo);
	}
}
