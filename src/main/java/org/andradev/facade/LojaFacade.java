package org.andradev.facade;

public class LojaFacade {
	private EstoqueService estoqueService;
	private FreteService freteService;
	private PagamentoService pagamentoService;
	
	public LojaFacade() {
		this.estoqueService = new EstoqueService();
		this.freteService = new FreteService();
		this.pagamentoService = new PagamentoService();
	}
	
	public void comprarProduto(String produto) {
		estoqueService.verificarEstoque(produto);
		freteService.calcularFrete(produto);
		pagamentoService.processarPagamento(produto);
		System.out.println("Compra finalizada para o produto: " + produto);
	}
}

