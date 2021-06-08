package recuperatorio.ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private Integer id;
	private List<Pedido> pedidos;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public void crearPedido(Integer nroPedido) {
		if(this.pedidos==null)this.pedidos = new ArrayList<Pedido>();
		this.pedidos.add(new Pedido(nroPedido));
	}
	
	public void agregarProducto(Integer nroPedido, Integer idProducto,Integer cantidad) {

		Producto p = Database.buscarProducto(idProducto);
		// verificar si el stock existente alcanza para agregarlo al pedido				

		// verificar si el cliente cumple la condicion pedida para agregar el producto
		Pedido pedido = this.buscarPorNro(nroPedido);
		pedido.addDetalle(p, cantidad);
	}
	
	public Pedido buscarPorNro(Integer nroPedido) {
		for(Pedido p : this.pedidos) {
			if(p.getNroPedido().equals(nroPedido)) return p;
		}
		return null;
	}
	
	public List<Producto> productosMontoMayor(Double monto)
	
	public Double compraPromedio()

	
}
