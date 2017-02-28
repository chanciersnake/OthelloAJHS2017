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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import org.w3c.dom.ranges.Range;





public class Grid extends JFrame implements ActionListener {

	public boolean Player = true;		//true = white ..... false = black
	public boolean Firstturn = true;
	public String BorW;
	public int GetActionCommand;
	public int Down;
	public int LeftRight;
	
	
	
	JButton[] theButtons = new JButton[65];
	
	JLabel[][] theLabels = new JLabel[8][8];
	
	JFrame VisibleC = new JFrame();
	
	JPanel label = new JPanel();
	JPanel buttons = new JPanel();
	
	
	
	Object[][] twoDim = new Object[8][8];{
		
		for(int z = 0; z < 8; z++){
			for(int x = 0; x < 8; x++){
				twoDim[z][x] = Chips.EMPTY;
			}
		}
		if(Firstturn == true){
			twoDim[3][3] = Chips.cBLACK;
			twoDim[3][4] = Chips.cWHITE;
			twoDim[4][3] = Chips.cWHITE;
			twoDim[4][4] = Chips.cBLACK;
		}
	}
	
	
	
	
	
	
	Font font = new Font("Courier", Font.BOLD, 50);
	
	
	public Grid() {
		gridShit();
		VisibleCheck();
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
	
	public void VisibleCheck(){
		VisibleC.setTitle("EnumCheck");

		
		VisibleC.setVisible(true);
		VisibleC.setSize(800, 800);
		VisibleC.setLayout(new BorderLayout());
		label.setLayout(new GridLayout(8, 8));
		
		makeTheJlabels();
		
		
		VisibleC.getContentPane().add(BorderLayout.CENTER, label);
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
		repaint();
	}
	
	
	
	public void makeTheButtons() {

		for (int i = 0; i < 64; i++) {
			theButtons[i] = new JButton("");
			theButtons[i].setFont(font);
			theButtons[i].addActionListener(this);
			theButtons[i].setActionCommand(i + "");
			theButtons[i].setBackground(Color.GREEN);
			buttons.add(theButtons[i]);

		}
		
		theButtons[27].setBackground(Color.BLACK);
		theButtons[28].setBackground(Color.WHITE);
		theButtons[35].setBackground(Color.WHITE);
		theButtons[36].setBackground(Color.BLACK);

		repaint();
	}
	
	
	
	public void makeTheJlabels(){

		for(int z = 0; z < 8; z++){
			for(int x = 0; x < 8; x++){
		theLabels[z][x] = new JLabel((twoDim[z][x]).toString());
		label.add(theLabels[z][x]);
			}
		}
		repaint();
	}
	
	
	
	//enums for each chip
	public enum Chips{
		EMPTY, cWHITE, cBLACK
	}

	
	
	public void refreshtheJLabel(){
		VisibleC.remove(label);
		label.removeAll();
		VisibleCheck();
		label.updateUI();
	}
	
	public void CheckVertical(){
		if (Player == true){ 		//white
			HowManyChipsBellow();
			for(;Down > 0;Down--){
				//twoDim
			}
		}
	}
	
	public void CheckHorizontal(){
		
	}
	
	public void CheckDiagnol(){
		
	}
	
	public void HowManyChipsBellow(){
		Down = 8 - GetActionCommand;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		//System.out.println(arg0.getActionCommand());
		//System.out.println(Player);
		
		
		GetActionCommand = Integer.parseInt(arg0.getActionCommand());
		
		if(Player == true){
			BorW = "white";
		}else{
			BorW = "black";
		}
		
		
		for (int i = 0; i < 64; i++) {
			
			if((arg0.getActionCommand().equals(i + ""))&&(twoDim[Integer.parseInt(arg0.getActionCommand())/8][Integer.parseInt(arg0.getActionCommand())%8] == Chips.cWHITE)||
					(twoDim[Integer.parseInt(arg0.getActionCommand())/8][Integer.parseInt(arg0.getActionCommand())%8] == Chips.cBLACK)){
				JOptionPane.showMessageDialog(null, "Error player " + BorW + " placed a chip on top of another chip. Try again.");
				break;
			}
			
			if((arg0.getActionCommand().equals(i + ""))&&(Player == true)){
				theButtons[Integer.parseInt(arg0.getActionCommand())].setBackground(Color.WHITE);
				twoDim[Integer.parseInt(arg0.getActionCommand())/8][Integer.parseInt(arg0.getActionCommand())%8] = Chips.cWHITE;
				
				//CheckVertical();
				//CheckHorizontal();
				//CheckDiagnol();
				
				//System.out.println(twoDim[Integer.parseInt(arg0.getActionCommand())/8][Integer.parseInt(arg0.getActionCommand())%8]);
				refreshtheJLabel();
				Player = false;
				break;
			
			}
			
			if((arg0.getActionCommand().equals(i + ""))&&(Player == false)){
				theButtons[Integer.parseInt(arg0.getActionCommand())].setBackground(Color.BLACK);
				twoDim[Integer.parseInt(arg0.getActionCommand())/8][Integer.parseInt(arg0.getActionCommand())%8] = Chips.cBLACK;
				
				//CheckVertical();
				//CheckHorizontal();
				//CheckDiagnol();
				
				//System.out.println(twoDim[Integer.parseInt(arg0.getActionCommand())/8][Integer.parseInt(arg0.getActionCommand())%8]);
				refreshtheJLabel();
				Player = true;
				break;
				
				
			}
			
		}
	}
}