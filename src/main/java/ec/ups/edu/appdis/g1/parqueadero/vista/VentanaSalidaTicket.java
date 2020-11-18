package ec.ups.edu.appdis.g1.parqueadero.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JLabel;
import javax.swing.JButton;

public class VentanaSalidaTicket {

	private JFrame frame;
	private JTextField txtPlaca;
	private JTextField txtFechaIngreso;
	private JTextField txtMarca;
	private JTextField txtCodigoTicket;
	private JTextField txtTicketId;
	private JTextField txtFechaSalida;
	private JTextField txtColor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSalidaTicket window = new VentanaSalidaTicket();
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
	public VentanaSalidaTicket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 573, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtPlaca = new JTextField();
		txtPlaca.setBounds(72, 97, 130, 26);
		frame.getContentPane().add(txtPlaca);
		txtPlaca.setColumns(10);
		
		txtFechaIngreso = new JTextField();
		txtFechaIngreso.setColumns(10);
		txtFechaIngreso.setBounds(145, 170, 130, 26);
		frame.getContentPane().add(txtFechaIngreso);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBounds(72, 132, 130, 26);
		frame.getContentPane().add(txtMarca);
		
		txtCodigoTicket = new JTextField();
		txtCodigoTicket.setColumns(10);
		txtCodigoTicket.setBounds(72, 20, 130, 26);
		frame.getContentPane().add(txtCodigoTicket);
		
		txtTicketId = new JTextField();
		txtTicketId.setColumns(10);
		txtTicketId.setBounds(72, 59, 130, 26);
		frame.getContentPane().add(txtTicketId);
		
		txtFechaSalida = new JTextField();
		txtFechaSalida.setColumns(10);
		txtFechaSalida.setBounds(437, 170, 130, 26);
		frame.getContentPane().add(txtFechaSalida);
		
		JLabel lblCodigoTicket = new JLabel("#");
		lblCodigoTicket.setBounds(6, 25, 27, 16);
		frame.getContentPane().add(lblCodigoTicket);
		
		JLabel lblTicketId = new JLabel("Ticket ID");
		lblTicketId.setBounds(6, 64, 61, 16);
		frame.getContentPane().add(lblTicketId);
		
		JLabel lblPlaca = new JLabel("Placa");
		lblPlaca.setBounds(6, 102, 61, 16);
		frame.getContentPane().add(lblPlaca);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(6, 137, 54, 16);
		frame.getContentPane().add(lblMarca);
		
		JLabel lblFechaYHora = new JLabel("Fecha y hora ingreso");
		lblFechaYHora.setBounds(6, 175, 136, 16);
		frame.getContentPane().add(lblFechaYHora);
		
		JLabel lblFechaYHora_1 = new JLabel("Fecha y hora salida");
		lblFechaYHora_1.setBounds(299, 175, 120, 16);
		frame.getContentPane().add(lblFechaYHora_1);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(210, 59, 97, 29);
		frame.getContentPane().add(btnBuscar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(190, 243, 117, 29);
		frame.getContentPane().add(btnLimpiar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(319, 243, 117, 29);
		frame.getContentPane().add(btnGuardar);
		
		txtColor = new JTextField();
		txtColor.setColumns(10);
		txtColor.setBounds(271, 132, 130, 26);
		frame.getContentPane().add(txtColor);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(214, 137, 61, 16);
		frame.getContentPane().add(lblColor);
	}
}
