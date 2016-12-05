package finalProject;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class Gui extends JFrame {

	/**
	 * 
	 */
	/*private static final long serialVersionUID = 1L;
	private JLabel welcome;
	private JLabel selectMessage;
	private JButton enterButton;
	private JList list;
	private static String[] teams = {"Rams", "Cardinals", "Chargers", "Panthers", "Giants", "Patriots", "Bronchos"};
	
	public Gui(){
		super("NFL Draft");
		setLayout(new FlowLayout());
		
		welcome = new JLabel("Welcome to NFL Draft");
		selectMessage = new JLabel("Select A Team");
		enterButton = new JButton("Enter");
		enterButton.setToolTipText("You can only choose one team");
		add(welcome);
		add(selectMessage);
		
		
		list = new JList(teams);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));
		add(enterButton);
		enterButton.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						chooseTeamFrame.dispose();
						PlayerPositionFrame playerPosition = new PlayerPositionFrame();
						playerPosition.setVisible(true);
				}
			}
		);
	}*/
}
