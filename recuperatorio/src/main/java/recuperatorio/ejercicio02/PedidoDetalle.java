package recuperatorio.ejercicio02;

public class PedidoDetalle {

	private Integer cantidad;
	private Producto producto;
	
	public PedidoDetalle() {
		
	}
	
	public PedidoDetalle(Integer cantidad, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
}
