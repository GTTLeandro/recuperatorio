package recuperatorio.ejercicio02;

import java.util.ArrayList;
import java.util.List;

import Excepciones.BusquedaProductoException;
import Excepciones.PresupuestoProductosInsuficienteException;
import Excepciones.StockInsuficienteException;

public class Cliente {

	private Integer id;
	private List<Pedido> pedidos;
	private Double montoMaxProd;
	
	
	public Double getMontoMaxProd() {
		return montoMaxProd;
	}
	
	public void setMontoMaxProd(Double montoMaxProd) {
		this.montoMaxProd = montoMaxProd;
	}
	
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
	
	public void agregarProducto(Integer nroPedido, Integer idProducto,Integer cantidad) throws StockInsuficienteException, PresupuestoProductosInsuficienteException, BusquedaProductoException {
		try
		{Producto p = Database.buscarProducto(idProducto);
				
		// verificar si el stock existente alcanza para agregarlo al pedido	
		if (p.getStock() <= cantidad) {throw new StockInsuficienteException();}
				
		// verificar si el cliente cumple la condicion pedida para agregar el producto
		if (this.montoDisponible(p) < p.getPrecio()) {throw new PresupuestoProductosInsuficienteException();}
		
		Pedido pedido = this.buscarPorNro(nroPedido);
		pedido.addDetalle(p, cantidad);
		}
		catch(DatabaseException db) {throw new BusquedaProductoException();}
	}
	
	
	public Pedido buscarPorNro(Integer nroPedido) {
		for(Pedido p : this.pedidos) {
			if(p.getNroPedido().equals(nroPedido)) return p;
		}
		return null;
	}
	
	public Double montoDisponible(Producto prod) {
		Double consumido= 0.0;
		for(Pedido p : this.pedidos) {
			for (PedidoDetalle pd : p.getDetalles()) {
				if (pd.getProducto().getId().equals(prod.getId())) {consumido += prod.getPrecio();}
			}
		}
		return montoMaxProd - consumido;
	}
	
	
	//public List<Producto> productosMontoMayor(Double monto)
	
	//public Double compraPromedio()

	
}
