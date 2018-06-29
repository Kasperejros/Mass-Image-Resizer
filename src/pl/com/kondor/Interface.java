package pl.com.kondor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Interface {

	private JFrame frmMassImageResizer;
	private JTextArea logText = new JTextArea();
	private ResizeManager resizeManager = new ResizeManager();
	private String[] resizeNames = resizeManager.nameList();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frmMassImageResizer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() {
		frmMassImageResizer = new JFrame();
		frmMassImageResizer.setResizable(false);
		frmMassImageResizer.setTitle("Mass Image Resizer");
		frmMassImageResizer.setBounds(100, 100, 450, 360);
		frmMassImageResizer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMassImageResizer.getContentPane().setLayout(null);
		Chooser chooser = new Chooser(this);
		chooser.setBounds(10, 25, 414, 50);
		

		frmMassImageResizer.getContentPane().add(chooser);
		
		JLabel lblKatalogGwny = new JLabel("Katalog G\u0142\u00F3wny:");
		lblKatalogGwny.setBounds(10, 11, 100, 14);
		frmMassImageResizer.getContentPane().add(lblKatalogGwny);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 86, 414, 2);
		frmMassImageResizer.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(216, 99, 2, 106);
		frmMassImageResizer.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 216, 414, 2);
		frmMassImageResizer.getContentPane().add(separator_2);
		
		JLabel lblFormaResizeu = new JLabel("Forma Zmiany Rozmiaru:");
		lblFormaResizeu.setBounds(20, 99, 186, 14);
		frmMassImageResizer.getContentPane().add(lblFormaResizeu);
		
		JComboBox resizeForm = new JComboBox();
		resizeForm.setModel(new DefaultComboBoxModel(resizeNames));
		resizeForm.setBounds(20, 124, 186, 20);
		frmMassImageResizer.getContentPane().add(resizeForm);
		
		JLabel lblFormaZapisuPlikw = new JLabel("Forma Zapisu Plik\u00F3w:");
		lblFormaZapisuPlikw.setBounds(228, 99, 196, 14);
		frmMassImageResizer.getContentPane().add(lblFormaZapisuPlikw);
		
		JComboBox saveForm = new JComboBox();
		saveForm.setModel(new DefaultComboBoxModel());
		saveForm.setBounds(228, 124, 186, 20);
		frmMassImageResizer.getContentPane().add(saveForm);
		
		JButton startButton = new JButton("Uruchom");
		startButton.setBounds(20, 245, 186, 50);
		frmMassImageResizer.getContentPane().add(startButton);
		
		JLabel lblLog = new JLabel("Log:");
		lblLog.setBounds(216, 231, 46, 14);
		frmMassImageResizer.getContentPane().add(lblLog);
		
		JButton copyLogButton = new JButton("Kopiuj do schowka");
		copyLogButton.setBounds(216, 300, 198, 14);
		frmMassImageResizer.getContentPane().add(copyLogButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(216, 245, 198, 50);
		frmMassImageResizer.getContentPane().add(scrollPane);
		scrollPane.setViewportView(logText);
		
		
		logText.setWrapStyleWord(true);
		logText.setLineWrap(true);
		logText.setEditable(false);
		logText.setForeground(Color.GREEN);
		logText.setBackground(Color.BLACK);
		logText.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		textField = new JTextField();
		textField.setBounds(103, 154, 73, 20);
		frmMassImageResizer.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(103, 185, 73, 20);
		frmMassImageResizer.getContentPane().add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Procent Skali:");
		lblNewLabel.setBounds(20, 158, 73, 14);
		frmMassImageResizer.getContentPane().add(lblNewLabel);
		
		JLabel lblNieaktywne = new JLabel("Nieaktywne:");
		lblNieaktywne.setBounds(21, 188, 73, 14);
		frmMassImageResizer.getContentPane().add(lblNieaktywne);
		
		textField_2 = new JTextField();
		textField_2.setBounds(314, 168, 100, 20);
		frmMassImageResizer.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPrefix = new JLabel("Sufix:");
		lblPrefix.setBounds(230, 171, 73, 14);
		frmMassImageResizer.getContentPane().add(lblPrefix);
	}
	
	public void logWrite(String line) {
		logText.append(line + "\n");
	}

	public float getParam1() {
		// TODO Auto-generated method stub
		return 0;
	}
}
