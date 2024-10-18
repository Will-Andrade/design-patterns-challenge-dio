package org.andradev;

import org.andradev.facade.LojaFacade;
import org.andradev.strategy.CarrinhoDeCompras;
import org.andradev.strategy.PagamentoCartaoCredito;
import org.andradev.strategy.PagamentoPaypal;

public class Main {
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.setStrategy(new PagamentoCartaoCredito());
		carrinho.realizarPagamento(500);
		
		carrinho.setStrategy(new PagamentoPaypal());
		carrinho.realizarPagamento(250);

		LojaFacade loja = new LojaFacade();
		loja.comprarProduto("Smartphone");
	}
}