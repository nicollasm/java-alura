package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
		BigDecimal percentual = desempenho.percentualReajuste();
		BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
		funcionario.reajustarSalario(reajuste);
	}
//		if (desempenho == Desempenho.A_DESEJAR) {
//			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
//			funcionario.reajustarSalario(reajuste);
//		}
//		if (desempenho == Desempenho.BOM) {
//			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.15"));
//			funcionario.reajustarSalario(reajuste);
//		}
//		if (desempenho == Desempenho.OTIMO) {
//			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.20"));
//			funcionario.reajustarSalario(reajuste);
//		}

//		switch (desempenho) {
//		case A_DESEJAR:
//			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
//			funcionario.reajustarSalario(reajuste);
//			break;
//		case BOM:
//			BigDecimal reajuste1 = funcionario.getSalario().multiply(new BigDecimal("0.15"));
//			funcionario.reajustarSalario(reajuste1);
//			break;
//		case OTIMO:
//			BigDecimal reajuste3 = funcionario.getSalario().multiply(new BigDecimal("0.20"));
//			funcionario.reajustarSalario(reajuste3);
//			break;
//		default:
//			break;
//		}

}
