import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frmLogin;
	private JTextField txtStudname;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblStudentName = DefaultComponentFactory.getInstance().createLabel("Student name");
		lblStudentName.setBounds(10, 66, 92, 14);
		frmLogin.getContentPane().add(lblStudentName);
		
		txtStudname = new JTextField();
		txtStudname.setBounds(112, 63, 204, 20);
		frmLogin.getContentPane().add(txtStudname);
		txtStudname.setColumns(10);
		
		JLabel lblStudentId = DefaultComponentFactory.getInstance().createLabel("Student ID");
		lblStudentId.setBounds(10, 116, 92, 14);
		frmLogin.getContentPane().add(lblStudentId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(112, 113, 204, 20);
		frmLogin.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//add code for the DB
				frmLogin.setVisible(false);
				course cor=new course();
				cor.setVisible(true);			
				
				
			}
		});
		btnLogIn.setBounds(251, 169, 89, 23);
		frmLogin.getContentPane().add(btnLogIn);
	}
}
