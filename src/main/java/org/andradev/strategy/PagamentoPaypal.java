package org.andradev.strategy;

public class PagamentoPaypal implements PagamentoStrategy {
	@Override
	public void pagar(int valor) {
		System.out.println("Pagamento de R$" + valor + " realizado com PayPal.");
	}
}
