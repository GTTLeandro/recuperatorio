package recuperatorio.ejercicio02;

public class Producto implements Comparable<Producto> {

	private Integer id;
	private String descripcion;
	private Integer stock;
	private Double precio;
	
	public Producto(){
		
	}
	
	

	public Producto(Integer id, String descripcion, Integer stock, Double precio) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.stock = stock;
		this.precio = precio;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	@Override
	public int compareTo(Producto o) {
		if (this.precio < o.precio) {return 1;}
		else if(this.precio > o.precio) {return -1;}
		return 0;
	}

	
}
