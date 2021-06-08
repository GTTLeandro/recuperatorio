package recuperatorio.ejercicio02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private Integer nroPedido;
	private LocalDate fecha;
	private List<PedidoDetalle> detalles;
	
	public Pedido() {
		this.fecha = LocalDate.now();
		this.detalles = new ArrayList<PedidoDetalle>();
	}
	
	public Pedido(Integer nroPedido) {
		this();
		this.nroPedido = nroPedido;
	}
	
	public Integer getNroPedido() {
		return nroPedido;
	}

	public void setNroPedido(Integer nroPedido) {
		this.nroPedido = nroPedido;
	}

	public Pedido(LocalDate fecha, List<PedidoDetalle> detalles) {
		super();
		this.fecha = fecha;
		this.detalles = detalles;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public List<PedidoDetalle> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<PedidoDetalle> detalles) {
		this.detalles = detalles;
	}

	public void addDetalle(Producto p, Integer c) {
		if(this.detalles==null) this.detalles = new ArrayList<PedidoDetalle>();
		this.detalles.add(new PedidoDetalle(c,p));
	}
	
}
