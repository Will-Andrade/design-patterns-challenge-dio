package org.andradev.strategy;

public class PagamentoCartaoCredito implements PagamentoStrategy {
	@Override
	public void pagar(int valor) {
		System.out.println("Pagamento de R$" + valor + " realizado com Cartão de Crédito.");
	}
}
