package Excepciones;

public class StockInsuficienteException  extends Exception{
	public StockInsuficienteException(){
		super("El stock disponible es inferior a lo solicitado");
	}
}
