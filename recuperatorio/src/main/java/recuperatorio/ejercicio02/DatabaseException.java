package recuperatorio.ejercicio02;

import java.sql.SQLException;

public class DatabaseException extends SQLException{

	public DatabaseException() {
		super("excepcion interactuando con la base de datos");
	}
}
