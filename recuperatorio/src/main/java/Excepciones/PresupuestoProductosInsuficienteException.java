package Excepciones;

public class PresupuestoProductosInsuficienteException extends Exception {
	public PresupuestoProductosInsuficienteException() {
		super("El monto del producto supera el disponible");
	}

}
