package ec.ups.edu.appdis.g1.parqueadero.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g1.parqueadero.modelo.Factura;
@Stateless
public class FacturaDao {
	
	@Inject
	private Connection con;
	
	public FacturaDao () {
		
	}
	public boolean insert (Factura factura) throws SQLException {
		String sql = "INSERT INTO Factura (cliente, fechaEmision, numeroFactura, ticket, valorTotal)"
				+ "VALUES (?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, factura.getCliente().getDni());
		ps.setDate(2, factura.getFechaEmision());
		ps.setString(3,factura.getNumeroFactura() );
		ps.setInt(4, factura.getTicket().getCodigo());
		ps.setDouble(5, factura.getValorTotal());
		
		ps.executeUpdate();
		ps.close();
		
		
		return true;
		
	}
	public boolean update (Factura factura) {
		return false;
	}
	
	public Factura read(int codigo) {
		
		return null;
	}
	public boolean delete (int codigo) {
		
		return false;
	}
}
