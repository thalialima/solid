package br.com.alura.rh.service;

import java.math.BigDecimal;

import br.com.alura.rh.model.Funcionario;

//uma interface costuma ser mais estável e mudar menos
public interface ValidacaoReajuste {

	void validar(Funcionario funcionario, BigDecimal aumento);
}
