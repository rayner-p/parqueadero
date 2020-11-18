package ec.ups.edu.appdis.g1.parqueadero.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaCierreDia {

	private JFrame frame;
	private JTextField txtFecha;
	private JTextField txtTotal;
	private JTextField txtHora;
	private JTextField txtNumerVehiculo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCierreDia window = new VentanaCierreDia();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaCierreDia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 354, 239);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(18, 35, 73, 16);
		panel.add(lblFecha);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(18, 106, 73, 16);
		panel.add(lblTotal);
		
		JLabel lblHora = new JLabel("Hora");
		lblHora.setBounds(18, 73, 73, 16);
		panel.add(lblHora);
		
		JLabel lblNumeroVehculos = new JLabel("Numero Vehículos");
		lblNumeroVehculos.setBounds(18, 146, 124, 16);
		panel.add(lblNumeroVehculos);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(147, 30, 130, 26);
		panel.add(txtFecha);
		txtFecha.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setColumns(10);
		txtTotal.setBounds(147, 101, 73, 26);
		panel.add(txtTotal);
		
		txtHora = new JTextField();
		txtHora.setColumns(10);
		txtHora.setBounds(147, 68, 130, 26);
		panel.add(txtHora);
		
		txtNumerVehiculo = new JTextField();
		txtNumerVehiculo.setColumns(10);
		txtNumerVehiculo.setBounds(147, 141, 73, 26);
		panel.add(txtNumerVehiculo);
		
		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.setBounds(147, 182, 91, 29);
		panel.add(btnNewButton);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(246, 182, 85, 29);
		panel.add(btnGuardar);
	}

}
