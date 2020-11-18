package ec.ups.edu.appdis.g1.parqueadero.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaCliente {

	private JFrame frame;
	private JTextField txtDni;
	private JTextField txtTipoDocumento;
	private JTextField txtNombre;
	private JTextField txtCorreo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCliente window = new VentanaCliente();
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
	public VentanaCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(16, 21, 61, 16);
		panel.add(lblDni);
		
		JLabel lblTIpoDocumento = new JLabel("Tipo de documento");
		lblTIpoDocumento.setBounds(16, 61, 130, 16);
		panel.add(lblTIpoDocumento);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(16, 107, 61, 16);
		panel.add(lblNombre);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(16, 154, 61, 16);
		panel.add(lblCorreo);
		
		txtDni = new JTextField();
		txtDni.setBounds(158, 16, 130, 26);
		panel.add(txtDni);
		txtDni.setColumns(10);
		
		txtTipoDocumento = new JTextField();
		txtTipoDocumento.setColumns(10);
		txtTipoDocumento.setBounds(158, 56, 130, 26);
		panel.add(txtTipoDocumento);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(158, 102, 130, 26);
		panel.add(txtNombre);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(158, 149, 130, 26);
		panel.add(txtCorreo);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(319, 16, 85, 29);
		panel.add(btnBuscar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(265, 191, 83, 29);
		panel.add(btnLimpiar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(350, 191, 83, 29);
		panel.add(btnGuardar);
	}

}
