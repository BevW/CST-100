package finalProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;

public class GuiTest {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiTest window = new GuiTest();
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
	public GuiTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setBounds(134, 52, 56, 16);
		frame.getContentPane().add(lblWelcome);
		
		JLabel lblSelect = new JLabel("Select");
		lblSelect.setBounds(35, 100, 56, 16);
		frame.getContentPane().add(lblSelect);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(232, 97, 31, 22);
		frame.getContentPane().add(comboBox);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(101, 130, 105, 60);
		frame.getContentPane().add(scrollPane_1);
	}
}
