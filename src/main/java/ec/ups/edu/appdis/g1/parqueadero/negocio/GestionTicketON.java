package ec.ups.edu.appdis.g1.parqueadero.negocio;


import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g1.parqueadero.datos.ClienteDao;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Ticket;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Vehiculo;
@Stateless
public class GestionTicketON {
	@Inject
	private ClienteDao con;
	
	public GestionTicketON() {
		
	}

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
