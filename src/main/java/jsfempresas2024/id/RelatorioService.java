package jsfempresas2024.id;

import java.math.BigDecimal;

public class RelatorioService {
	
	private Pedidos pedidos;
	
	
	
	public RelatorioService(Pedidos pedidos) {
		this.pedidos = pedidos;
	}
	
	public RelatorioService() {

	}

	public BigDecimal totalPedidosMesAtual() {
		return pedidos.totalPedidosMesAtual();
	}
	
	public void setPedidos(Pedidos pedidos) {
		this.pedidos = pedidos;
	}
}
