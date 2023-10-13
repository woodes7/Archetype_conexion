#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package Controlador;
import Servicio.InterfazConexion;
import Servicio.ImplementacionConexion;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfazConexion conexion = new ImplementacionConexion();
		
		conexion.EstablecerConexionConBD();
	}

}
