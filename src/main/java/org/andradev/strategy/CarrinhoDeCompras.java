package org.andradev.strategy;

public class CarrinhoDeCompras {
	private PagamentoStrategy strategy;
	
	public void setStrategy(PagamentoStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void realizarPagamento(int valor) {
		strategy.pagar(valor);
	}
}
