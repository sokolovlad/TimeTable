import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class course extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					course frame = new course();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public course() {
		setTitle("Courses");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxCourse = new JCheckBox("course 1");
		chckbxCourse.setBounds(6, 46, 97, 23);
		contentPane.add(chckbxCourse);
		
		JCheckBox chckbxCourse_1 = new JCheckBox("course 2");
		chckbxCourse_1.setBounds(6, 72, 97, 23);
		contentPane.add(chckbxCourse_1);
		
		JCheckBox chckbxCourse_2 = new JCheckBox("course 3");
		chckbxCourse_2.setBounds(6, 98, 97, 23);
		contentPane.add(chckbxCourse_2);
		
		JButton btnPrintTimetable = new JButton("Print Timetable");
		btnPrintTimetable.setBounds(161, 179, 158, 23);
		contentPane.add(btnPrintTimetable);
	}
}
