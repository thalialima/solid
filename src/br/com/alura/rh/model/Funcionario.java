package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class
Funcionario {

	private DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dadosPessoais.setNome(nome);
		this.dadosPessoais.setCpf(cpf);
		this.dadosPessoais.setCargo(cargo);
		this.dadosPessoais.setSalario(salario);
		this.dataUltimoReajuste = LocalDate.of(2020, 10, 7);
	}
	
	@Override
	public String toString() {
		return "Funcionario [Dados Pessoais = " + dadosPessoais 
				+ ", Data Ultimo Reajuste = " + dataUltimoReajuste + " ]";
	}


	//um terceirizado não pode ter reajuste salarial
	public void atualizarSalario(BigDecimal novoSalario) {
		this.dadosPessoais.setSalario(novoSalario);
		this.dataUltimoReajuste = LocalDate.now();
	}


	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	//um terceirizado não pode ser promovido
	public void promover(Cargo novoCargo) {
		this.dadosPessoais.setCargo(novoCargo);
	}

}
