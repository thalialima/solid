package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

//nem toda classe que implementar a interface vai precisar 
//do segundo parâmetro do método.
public class ValidacaoPeriodiciadadeEntreReajustes implements ValidacaoReajuste {

	public void validar(Funcionario funcionario, BigDecimal aumento) {
		 //fail fast
        if(funcionario.getDataUltimoReajuste().isAfter(LocalDate.now().minusMonths(6)))
        	throw new ValidacaoException("É necessário um intervalo mínimo de 6 meses entre os reajustes!");

	}
}
