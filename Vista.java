import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;


public class Vista extends JFrame implements ActionListener{

	private JPanel contentPane = new JPanel(); 
	private JTextField txtAtributo;
	
	public JLabel lblAtributo = new JLabel("Atributo");
	
	public JComboBox<String> combo = new JComboBox<String>();
	
	public ButtonGroup grupoRadio = new ButtonGroup(); 
	
	public JScrollPane scroll = new JScrollPane();
	
	public JButton btnAgregar = new JButton("Agregar");
	public JButton btnCrear = new JButton("Crear");

	public JLabel lblNombreBD = new JLabel("Nombre BD");
	public JLabel lblTabla = new JLabel("Nombre tabla");
	
	public JCheckBox chckbxCsv = new JCheckBox("Csv",false);
	public JCheckBox chckbxSql = new JCheckBox("Sql",true);
	

	/**
	 * 
	 *	
	 *
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 440, 474);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtAtributo = new JTextField();
		txtAtributo.setBounds(205, 53, 90, 20);
		contentPane.add(txtAtributo);
		txtAtributo.setColumns(10);
		lblNombreDelAtributo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombreDelAtributo.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		lblAtributo.setBounds(195, 28, 90, 14);
		contentPane.add(lblNombreDelAtributo);
		
		btnAgregar.setBounds(147, 190, 89, 23);
		contentPane.add(btnAgregar);
		
		scroll.setBounds(90, 224, 215, 120);
		contentPane.add(scroll);
		
		btnCrear.setBounds(308, 402, 89, 23);
		contentPane.add(btnGenerar);
		
		chckbxCsv.setBounds(249, 402, 53, 23);
		grupoCheck.add(chckbxCsv);
		contentPane.add(chckbxCsv);
		
		chckbxSql.setBounds(195, 402, 53, 23);
		grupoCheck.add(chckbxSql);
		contentPane.add(chckbxSql);
		lblNombreBd.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		
		lblNombreBD.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreBD.setBounds(10, 11, 102, 20);
		contentPane.add(lblNombreBD);
		lblNombreTabla.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		lblNombreTabla.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreTabla.setBounds(10, 69, 102, 14);
		contentPane.add(lblTabla);
		
		NomBD = new JTextField();
		NomBD.setColumns(10);
		NomBD.setBounds(20, 38, 90, 20);
		contentPane.add(NomBD);
		
		NomTabla = new JTextField();
		NomTabla.setColumns(10);
		NomTabla.setBounds(21, 94, 90, 20);
		contentPane.add(NomTabla);
		
		combo.setBounds(147, 133,130,20);
		combo.addItem("Nombre");
		combo.addItem("Apellido");
		combo.addItem("Telefono");
		combo.addItem("Correo");	
		combo.addItem("Ciudad");
		
	
		
		contentPane.add(combo);
		
		JLabel lblNombreArchivo = new JLabel("Nombre del Archivo");
		lblArchivo.setForeground(Color.WHITE);
		lblArchivo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblArchivo.setHorizontalAlignment(SwingConstants.CENTER);
		lblArchivo.setBounds(72, 372, 138, 20);
		contentPane.add(lblArchivo);
		
		txtNomArchivo = new JTextField();
		txtNomArchivo.setColumns(10);
		txtNomArchivo.setBounds(80, 403, 90, 20);
		contentPane.add(txtNomArchivo);
		textPane.setBounds(92, 226, 213, 118);
		contentPane.add(textPane);
		textPane.setFont(new Font("Tahoma", Font.BOLD, 11));
		textPane.setEditable(false);
		textPane.setEnabled(false);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("F:\\Archivos\\Jair\\8ITI1\\SDC15531.jpg"));
		lblNewLabel.setBounds(0, 0, 424, 436);
		contentPane.add(lblNewLabel);
		
		btnAgregar.addActionListener(this);
		btnCrear.addActionListener(this);
		
		
		
		
	}
}
	
