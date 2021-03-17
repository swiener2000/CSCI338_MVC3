package edu.unca.csci338;
import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.event.*;

public class MVCTestView extends JFrame{
	
	//instance variables
	private JPanel panel;
	private JLabel name1Lbl;
	private JTextField nameText;
	private JButton submit;
	private final int WIDTH = 400;
	private final int HEIGHT = 500;
	//private JLabel adj1Lbl;
	//private JLabel adj2Lbl;
	//private JLabel adj3Lbl;
	//private JLabel name2Lbl;
	//private JButton Submit;
	
	/**
	 * constructor
	 * 
	 */
	public MVCTestView () {
		
		//set window title
		setTitle("Enter Words");
		
		//set window size
		setSize(WIDTH,HEIGHT);
		
		//close window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//build panel and add to frame
		buildPanel();
		
		//add panel to frame content pane
		add(panel);
		
		//display
		setVisible(true);	
	}
	
	/**
	 * BuildPanel adds labels, text fields, and a button
	 */
	private void buildPanel() {
		//display instructions
		setName1Lbl(new JLabel("Enter the words here!"));
		
		//create text field 10 characters wide
		setNameText(new JTextField(10));
		
		//create a button with the caption submit
		setSubmit(new JButton("Submit"));
		
		//create a JPanel object and let the panel field reference it
		panel = new JPanel();
		
		//add the label, text field, and button components to the panel
		panel.add(name1Lbl);
		panel.add(nameText);
		panel.add(submit);
	}

	public JButton getSubmit() {
		return submit;
	}

	public void setSubmit(JButton submit) {
		this.submit = submit;
	}

	public JLabel getName1Lbl() {
		return name1Lbl;
	}

	public void setName1Lbl(JLabel name1Lbl) {
		this.name1Lbl = name1Lbl;
	}

	public JTextField getNameText() {
		return nameText;
	}

	public void setNameText(JTextField nameText) {
		this.nameText = nameText;
	}
	
	
}
