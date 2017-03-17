
import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.Component;

import java.awt.FlowLayout;

import java.awt.Font;

import java.awt.Graphics;

import java.awt.GridLayout;

import java.awt.Image;

import java.awt.Toolkit;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;


import javax.swing.BoxLayout;

import javax.swing.ImageIcon;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

import javax.swing.JPanel;

import javax.swing.JPasswordField;

import javax.swing.JTextField;

import javax.swing.UIManager;


public class BeginingGameScreen extends JFrame implements ActionListener {

    

    //Play boolean

    public boolean GameOn = true;

    

    

    //JLabel

    JLabel Othello = new JLabel("Othello");

    JLabel CoolBackground = new JLabel(new ImageIcon("H:/OTHELLO/OthelloAJHS2017/gifgif.gif"));

    

    //JFrame

     JFrame HowtoPlay = new JFrame();


    

    //Buttons

    JButton PlayOthello = new JButton("Play Othello");

    JButton Rules = new JButton("How to Play");

    JButton Exit = new JButton("Exit");

    

    //set Font of text

    Font Cool = new Font("Zapfino", Font.ITALIC,100);

    Font ok = new Font("Rockwell", Font.BOLD,20);


    public BeginingGameScreen() {

        

        

        int x = 550;

        int y = 550;

    

        

        

        

        //JFrame layout

        this.setSize(x, y);

        this.setVisible(true);

        this.setResizable(false);

        this.setTitle("Othello");

        this.getContentPane().setBackground(Color.decode("#252525"));

        

        //this.setBackground(Color.);

        

        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );


        //JPanel layout

        CoolBackground.setLayout(null);

        

        //Color

        Othello.setForeground(Color.decode("#63F472"));

        

        

        // Positioning

        //                        x           y    width    height

        PlayOthello.setBounds((x/2)-75, (y/2), 150, 50);

        Rules.setBounds((x/2)-75, ((y/2)+50), 150, 50);

        Exit.setBounds((x/2)-75, ((y/2)+100), 150, 50);

        Othello.setBounds(100, 25, 500, 200);

        

        

       //Adding commands to the 2 buttons

        PlayOthello.addActionListener(this);

        PlayOthello.setActionCommand("PLAY");

        

        Rules.addActionListener(this);

        Rules.setActionCommand("RULES");

        

        Exit.addActionListener(this);

        Exit.setActionCommand("EXIT");

        

        //Adding to JFrame

        

        CoolBackground.add(Othello);

        CoolBackground.add(PlayOthello);

        CoolBackground.add(Rules);

        CoolBackground.add(Exit);

        this.add(CoolBackground);

        

        //setting Font

        PlayOthello.setFont(ok);

        Rules.setFont(ok);

        Exit.setFont(ok);

        Othello.setFont(Cool);

       


    }

    

     public void HowToPlay(){

          

          HowtoPlay.setSize(550, 550);

             HowtoPlay.setVisible(true);

             HowtoPlay.setResizable(false);

             HowtoPlay.setTitle("How to Play");

             HowtoPlay.getContentPane().setBackground(Color.decode("#ffffff"));

             

             

             setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

         }




     @Override

     public void actionPerformed(ActionEvent arg0) {

      if(arg0.getActionCommand().equals("PLAY")){

       Grid Vince = new Grid();

       //EnumsAndGridTalkTEST Vince = new EnumsAndGridTalkTEST();

       this.setVisible(false);

      }

      

      if(arg0.getActionCommand().equals("Exit")){

      

       GameOn = false;

       System.exit(0);

      }

      

      

      if(arg0.getActionCommand().equals("RULES")){

       HowToPlay();

      }


        }

    }



