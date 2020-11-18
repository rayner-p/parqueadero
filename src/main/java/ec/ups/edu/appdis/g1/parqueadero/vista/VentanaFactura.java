package ec.ups.edu.appdis.g1.parqueadero.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaFactura {

	private JFrame frame;
	private JTextField txtNumeroFactura;
	private JTextField txtFechaEmision;
	private JTextField txtDni;
	private JTextField txtNombre;
	private JTextField txtCorreo;
	private JTextField txtPlaca;
	private JTextField txtFechaIngreso;
	private JTextField txtFechaSalida;
	private JTextField txtValorTotal;
	private JTextField txtTiempoParqueo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFactura window = new VentanaFactura();
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
	public VentanaFactura() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 409, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNumeroFactura = new JLabel("#");
		lblNumeroFactura.setBounds(19, 16, 61, 16);
		panel.add(lblNumeroFactura);
		
		JLabel lblFechaEmisin = new JLabel("Fecha emisión");
		lblFechaEmisin.setBounds(19, 53, 90, 16);
		panel.add(lblFechaEmisin);
		
		JLabel lblDni = new JLabel("Dni");
		lblDni.setBounds(19, 87, 61, 16);
		panel.add(lblDni);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(19, 125, 61, 16);
		panel.add(lblNombre);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(19, 162, 61, 16);
		panel.add(lblCorreo);
		
		JLabel lblPlaca = new JLabel("Placa");
		lblPlaca.setBounds(19, 199, 61, 16);
		panel.add(lblPlaca);
		
		JLabel lblFechaYHora = new JLabel("Fecha y hora Ingreso");
		lblFechaYHora.setBounds(19, 234, 145, 16);
		panel.add(lblFechaYHora);
		
		JLabel lblFechaSalida = new JLabel("Fecha y hora Salida");
		lblFechaSalida.setBounds(19, 263, 130, 16);
		panel.add(lblFechaSalida);
		
		JLabel lblTiempoParqueo = new JLabel("Tiempo parqueo");
		lblTiempoParqueo.setBounds(19, 298, 119, 16);
		panel.add(lblTiempoParqueo);
		
		JLabel lblValorTotal = new JLabel("Valor total");
		lblValorTotal.setBounds(19, 329, 90, 16);
		panel.add(lblValorTotal);
		
		txtNumeroFactura = new JTextField();
		txtNumeroFactura.setBounds(121, 11, 130, 26);
		panel.add(txtNumeroFactura);
		txtNumeroFactura.setColumns(10);
		
		txtFechaEmision = new JTextField();
		txtFechaEmision.setColumns(10);
		txtFechaEmision.setBounds(121, 48, 130, 26);
		panel.add(txtFechaEmision);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(121, 82, 130, 26);
		panel.add(txtDni);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(121, 120, 130, 26);
		panel.add(txtNombre);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(121, 157, 130, 26);
		panel.add(txtCorreo);
		
		txtPlaca = new JTextField();
		txtPlaca.setColumns(10);
		txtPlaca.setBounds(121, 194, 130, 26);
		panel.add(txtPlaca);
		
		txtFechaIngreso = new JTextField();
		txtFechaIngreso.setColumns(10);
		txtFechaIngreso.setBounds(176, 229, 130, 26);
		panel.add(txtFechaIngreso);
		
		txtFechaSalida = new JTextField();
		txtFechaSalida.setColumns(10);
		txtFechaSalida.setBounds(176, 258, 130, 26);
		panel.add(txtFechaSalida);
		
		txtValorTotal = new JTextField();
		txtValorTotal.setColumns(10);
		txtValorTotal.setBounds(176, 324, 130, 26);
		panel.add(txtValorTotal);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(216, 362, 90, 29);
		panel.add(btnImprimir);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(300, 362, 90, 29);
		panel.add(btnGuardar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpiar.setBounds(134, 362, 90, 29);
		panel.add(btnLimpiar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(310, 48, 80, 29);
		panel.add(btnBuscar);
		
		txtTiempoParqueo = new JTextField();
		txtTiempoParqueo.setColumns(10);
		txtTiempoParqueo.setBounds(176, 293, 130, 26);
		panel.add(txtTiempoParqueo);
	}

}
