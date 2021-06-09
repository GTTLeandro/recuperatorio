package recuperatorio.ejercicio02;

import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
	
	public List<Producto> buscarNProductosPrecioMinimo(Double precMin,Integer n){
		
		//Este método retorna la lista de primeros N productos cuyo precio es mayor a precMin 
		//ordenados por precio descendentemente
		
		Predicate<Producto> p1 = prod -> prod.getPrecio() > precMin;
		List<Producto> resultado =_PRODUCTOS.stream()
												.filter(p1)
												.sorted((t1,t2) -> t1.compareTo(t2))
												.limit(n)
												.collect(Collectors.toList());
		return resultado;
		}
	
	public Integer stockTotal() {
		
		//retorna el stock total de productos que tiene el sistema 
		//(la suma de existencias de todos los productos)
		
		List<Integer> resultado = _PRODUCTOS.stream()
												.map(t -> t.getStock())
												.collect(Collectors.toList());
		Integer stockT=0;
		for (Integer s : resultado) {stockT +=s;}
		return stockT;
		}
												
												
									
		
	}

