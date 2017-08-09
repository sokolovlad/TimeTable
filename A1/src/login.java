import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frmLogin;
	private JTextField txtStudname;
	private JTextField txtStudID;

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
		
		txtStudID = new JTextField();
		txtStudID.setBounds(112, 113, 204, 20);
		frmLogin.getContentPane().add(txtStudID);
		txtStudID.setColumns(10);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//add code for the DB
				String dbUrl = "jdbc:mysql://localhost:3306/timetable";
				String user = "root";
				String password = "";
				
				try {
					//1. established  the connection
					Connection myConn = DriverManager.getConnection(dbUrl, user, password);
					
					//2. create a statement
					Statement myStmt = myConn.createStatement();
					
					//3. execute the query
					ResultSet myRs = myStmt.executeQuery("select * from Student");
					
					//4. process the resultset object
					while(myRs.next()){
					if((txtStudname.getText().equals(myRs.getString("Student_name"))) && 
						(txtStudID.getText().equals(myRs.getString("Student_ID")))) {
					//JOptionPane.showMessageDialog(null, "Correct credentials");
					frmLogin.dispose();
					course obj = new course();
					obj.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Error");
						txtStudname.setText("");
						txtStudID.setText("");
				}
			{
					myStmt.close();
					myStmt.close();
						}
					}
				}
				catch(Exception e){
					e.printStackTrace();
				}
				
//				frmLogin.setVisible(false);
//				course cor=new course();
//				cor.setVisible(true);			
//				
				
			}
		});
		btnLogIn.setBounds(251, 169, 89, 23);
		frmLogin.getContentPane().add(btnLogIn);
	}
		}
		

