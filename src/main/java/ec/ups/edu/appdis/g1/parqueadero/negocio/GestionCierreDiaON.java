package ec.ups.edu.appdis.g1.parqueadero.negocio;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;

import ec.ups.edu.appdis.g1.parqueadero.modelo.CierreDia;
@Stateless
public class GestionCierreDiaON {
	

	public boolean registrarCierre(CierreDia cierre) {
		return true;
	}
	
	public CierreDia buscarCierre(Date fecha) {
		return null;
	}
	
	public boolean contabilizarDia(Date fecha) {
		return false;
	}

	public List<CierreDia> getCierreDia(Date fecha) {
		return null;
	}
}
