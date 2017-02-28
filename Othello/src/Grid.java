import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import org.w3c.dom.ranges.Range;

public class Grid extends JFrame implements ActionListener {

	public boolean Player = true;		//true = white ..... false = black
	
	
	JButton[] theButtons = new JButton[65];
	
	JPanel buttons = new JPanel();
	
	
	Font font = new Font("Courier", Font.BOLD, 50);
	
	
	public Grid() {
		gridShit();
		
	}

	
	public void gridShit(){
		this.setTitle("Othelo grid test");

		this.setVisible(true);
		this.setSize(800, 800);
		this.setLayout(new BorderLayout());
		buttons.setLayout(new GridLayout(8, 8));
		makeTheButtons();
		this.getContentPane().add(BorderLayout.CENTER, buttons);
		
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
		repaint();
	}
	
	public void makeTheButtons() {

		for (int i = 1; i < 65; i++) {
			theButtons[i] = new JButton("");
			theButtons[i].setFont(font);
			theButtons[i].addActionListener(this);
			theButtons[i].setActionCommand(i + "");
			theButtons[i].setBackground(Color.GREEN);
			buttons.add(theButtons[i]);

		}
		
		theButtons[28].setBackground(Color.BLACK);
		theButtons[29].setBackground(Color.WHITE);
		theButtons[36].setBackground(Color.WHITE);
		theButtons[37].setBackground(Color.BLACK);

		repaint();
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println(arg0.getActionCommand());
		System.out.println(Player);
		
		int[] nums = new int[65];
		for (int i = 1; i < 65; i++) {
			
			if((arg0.getActionCommand().equals(i + ""))&&(Player = true)){
				theButtons[Integer.parseInt(arg0.getActionCommand())].setBackground(Color.WHITE);
				Player = false;
				break;
			
			}
			
			if((arg0.getActionCommand().equals(i + ""))&&(Player = false)){
				theButtons[Integer.parseInt(arg0.getActionCommand())].setBackground(Color.BLACK);
				Player = true;
				break;
				
			}
			
		}
	}
}