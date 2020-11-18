package ec.ups.edu.appdis.g1.parqueadero.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class VentaIngresoTicket {

	private JFrame frame;
	private JTextField txtCodigoTicket;
	private JTextField txtFechaHora;
	private JTextField txtPlaca;
	private JTextField txtMarca;
	private JTextField txtColor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentaIngresoTicket window = new VentaIngresoTicket();
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
	public VentaIngresoTicket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 535, 268);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		txtCodigoTicket = new JTextField();
		txtCodigoTicket.setBounds(102, 16, 130, 26);
		panel.add(txtCodigoTicket);
		txtCodigoTicket.setColumns(10);
		
		txtFechaHora = new JTextField();
		txtFechaHora.setColumns(10);
		txtFechaHora.setBounds(102, 68, 130, 26);
		panel.add(txtFechaHora);
		
		txtPlaca = new JTextField();
		txtPlaca.setColumns(10);
		txtPlaca.setBounds(102, 106, 130, 26);
		panel.add(txtPlaca);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBounds(102, 149, 130, 26);
		panel.add(txtMarca);
		
		txtColor = new JTextField();
		txtColor.setColumns(10);
		txtColor.setBounds(311, 149, 130, 26);
		panel.add(txtColor);
		
		JLabel lblCodigoTicket = new JLabel("#");
		lblCodigoTicket.setBounds(6, 21, 35, 16);
		panel.add(lblCodigoTicket);
		
		JLabel lblFechaYHora = new JLabel("Fecha y hora");
		lblFechaYHora.setBounds(6, 65, 103, 16);
		panel.add(lblFechaYHora);
		
		JLabel lblPlaca = new JLabel("Placa");
		lblPlaca.setBounds(6, 111, 61, 16);
		panel.add(lblPlaca);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(6, 154, 61, 16);
		panel.add(lblMarca);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(253, 154, 46, 16);
		panel.add(lblColor);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(243, 106, 85, 29);
		panel.add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(285, 211, 117, 29);
		panel.add(btnLimpiar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(408, 211, 117, 29);
		panel.add(btnGuardar);
	}

}
