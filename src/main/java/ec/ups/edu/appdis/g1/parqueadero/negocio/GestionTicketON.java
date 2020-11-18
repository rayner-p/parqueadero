package ec.ups.edu.appdis.g1.parqueadero.negocio;

import ec.ups.edu.appdis.g1.parqueadero.modelo.Ticket;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Vehiculo;

public class GestionTicketON {
	public boolean registrarIngreso (Ticket ticket) {
		return true;
	}
	public Ticket salidaVehiculo (int tikcet) {
		return null;
		
	}
	public double  calcularTiempo (int idTicket) {
		return 0;
	}
	public Vehiculo buscarVehiculo (String placa) {
		return null;
	}
	public boolean registrarIngreso(int  numero, String placa, String marca, String color) {
		return true;
	}
}
