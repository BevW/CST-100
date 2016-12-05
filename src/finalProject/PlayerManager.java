package finalProject;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import javafx.fxml.Initializable;

public class PlayerManager implements Initializable {
		public static void main(String[] args){
			Gui go = new Gui();
			go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			go.setSize(500,500);
			go.setVisible(true);
			
			JFrame chooseTeamFrame = new JFrame("NFL Draft");
			chooseTeamFrame.setLayout(new FlowLayout());
			JLabel welcome;
			JLabel selectMessage;
			JButton enterButton;
			JList list;
			String[] teams = {"Rams", "Cardinals", "Chargers", "Panthers", "Giants", "Patriots", "Bronchos"};
			
			welcome = new JLabel("Welcome to NFL Draft!      ");
			selectMessage = new JLabel("Select A Team");
			enterButton = new JButton("Enter");
			enterButton.setToolTipText("You can only choose one team");
			chooseTeamFrame.add(welcome);
			chooseTeamFrame.add(selectMessage);
			
			
			list = new JList(teams);
			list.setVisibleRowCount(4);
			list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			chooseTeamFrame.add(new JScrollPane(list));
			chooseTeamFrame.add(enterButton);
			enterButton.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent event){
							chooseTeamFrame.dispose();
							PlayerPositionFrame playerPosition = new PlayerPositionFrame();
							playerPosition.setVisible(true);
					}
				}
			);
			chooseTeamFrame.setSize(500, 500);
			chooseTeamFrame.setVisible(true);
			chooseTeamFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		class PlayerPositionFrame {
			JFrame playerpostion = new JFrame("Player or Posisttion");

			public void setVisible(boolean b) {
				// TODO Auto-generated method stub
			}
		}
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			JScrollPane.setItem(teams);
		}
}