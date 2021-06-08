package recuperatorio.ejercicio02;

import java.util.List;
import java.util.Random;

public class Database {
	
	private static List<Producto> _PRODUCTOS;
	public static void loadProductos() {
		Random r = new Random();
		for(int i=0;i<10;i++) {
			_PRODUCTOS.add(new Producto(i+1, "PRODUCTO "+i, 3, r.nextDouble()*100));
		}
	}
	
	public static Producto buscarProducto(Integer id) throws DatabaseException{
		for(Producto p : _PRODUCTOS) {
			if(p.getId().equals(id)) return p;
		}
		return null;
	}
	
}
