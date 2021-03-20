package edu.unca.CSCI338;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class View {
	// View uses Swing framework to display UI to user
	 private JFrame frame;

	 private JLabel adj1Label;
	 private JLabel verbLabel;
	 private JLabel adj2Label;
	 private JLabel nounLabel;
	 private JLabel verb2Label;
	 private JLabel adj3Label;
	 private JLabel noun2Label;
	 private JLabel adj4Label;
	 private JLabel adj5Label;
	 private JLabel noun3Label;
	 private JLabel noun4Label;
	 
	 private JTextField adj1TF;
	 private JTextField verb1TF;
	 private JTextField adj2TF;
	 private JTextField noun1TF;
	 private JTextField verb2TF;
	 private JTextField adj3TF;
	 private JTextField noun2TF;
	 private JTextField adj4TF;
	 private JTextField adj5TF;
	 private JTextField noun3TF;
	 private JTextField noun4TF;
	 
	 
	 
	public JTextField getAdj1TF() {
		return adj1TF;
	}
	public void setAdj1TF(JTextField adj1tf) {
		adj1TF = adj1tf;
	}
	public JTextField getVerb1TF() {
		return verb1TF;
	}
	public void setVerb1TF(JTextField verblTF) {
		this.verb1TF = verblTF;
	}
	public JTextField getAdj2TF() {
		return adj2TF;
	}
	public void setAdj2TF(JTextField adj2tf) {
		adj2TF = adj2tf;
	}
	public JTextField getNoun1TF() {
		return noun1TF;
	}
	public void setNoun1TF(JTextField noun1tf) {
		noun1TF = noun1tf;
	}
	public JTextField getVerb2TF() {
		return verb2TF;
	}
	public void setVerb2TF(JTextField verb2tf) {
		verb2TF = verb2tf;
	}
	public JTextField getAdj3TF() {
		return adj3TF;
	}
	public void setAdj3TF(JTextField adj3tf) {
		adj3TF = adj3tf;
	}
	public JTextField getNoun2TF() {
		return noun2TF;
	}
	public void setNoun2TF(JTextField noun2tf) {
		noun2TF = noun2tf;
	}
	public JTextField getAdj4TF() {
		return adj4TF;
	}
	public void setAdj4TF(JTextField adj4tf) {
		adj4TF = adj4tf;
	}
	public JTextField getAdj5TF() {
		return adj5TF;
	}
	public void setAdj5TF(JTextField adj5tf) {
		adj5TF = adj5tf;
	}
	public JTextField getNoun3TF() {
		return noun3TF;
	}
	public void setNoun3TF(JTextField noun3tf) {
		noun3TF = noun3tf;
	}
	public JTextField getNoun4TF() {
		return noun4TF;
	}
	public void setNoun4TF(JTextField noun4tf) {
		noun4TF = noun4tf;
	}


public JLabel getAdj1Label() {
		return adj1Label;
	}
	public void setAdj1Label(JLabel adj1Label) {
		this.adj1Label = adj1Label;
	}
	public JLabel getVerbLabel() {
		return verbLabel;
	}
	public void setVerbLabel(JLabel verbLabel) {
		this.verbLabel = verbLabel;
	}
	public JLabel getAdj2Label() {
		return adj2Label;
	}
	public void setAdj2Label(JLabel adj2Label) {
		this.adj2Label = adj2Label;
	}
	public JLabel getNounLabel() {
		return nounLabel;
	}
	public void setNounLabel(JLabel nounLabel) {
		this.nounLabel = nounLabel;
	}
	public JLabel getVerb2Label() {
		return verb2Label;
	}
	public void setVerb2Label(JLabel verb2Label) {
		this.verb2Label = verb2Label;
	}
	public JLabel getAdj3Label() {
		return adj3Label;
	}
	public void setAdj3Label(JLabel adj3Label) {
		this.adj3Label = adj3Label;
	}
	public JLabel getNoun2Label() {
		return noun2Label;
	}
	public void setNoun2Label(JLabel noun2Label) {
		this.noun2Label = noun2Label;
	}
	public JLabel getAdj4Label() {
		return adj4Label;
	}
	public void setAdj4Label(JLabel adj4Label) {
		this.adj4Label = adj4Label;
	}
	public JLabel getAdj5Label() {
		return adj5Label;
	}
	public void setAdj5Label(JLabel adj5Label) {
		this.adj5Label = adj5Label;
	}
	public JLabel getNoun3Label() {
		return noun3Label;
	}
	public void setNoun3Label(JLabel noun3Label) {
		this.noun3Label = noun3Label;
	}
	public JLabel getNoun4Label() {
		return noun4Label;
	}
	public void setNoun4Label(JLabel noun4Label) {
		this.noun4Label = noun4Label;
	}


	 private JButton SaveButton;
	 private JButton display;
	 public View(String title) {
	  frame = new JFrame(title);
	  frame.getContentPane().setLayout(new BorderLayout());
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setSize(500, 420);
	  frame.setLocationRelativeTo(null);
	  frame.setVisible(true);
	  // Create UI elements  
	  adj1Label = new JLabel("Adjective:");
	  verbLabel = new JLabel("Verb:");
	  adj2Label = new JLabel("Adjective:");
	  nounLabel = new JLabel("Noun:");
	  verb2Label= new JLabel("Verb:");
	  adj3Label = new JLabel("Adjective:");
	  noun2Label = new JLabel("Noun:");
	  adj4Label = new JLabel("Adjective:");
	  adj5Label = new JLabel("Adjective:");
	  noun3Label = new JLabel("Noun:");
	  noun4Label= new JLabel("Noun:");
	    
	  
	  
	  adj1TF = new JTextField();
	  verb1TF = new JTextField();
	  adj2TF =new JTextField();
	  noun1TF = new JTextField();
	  verb2TF= new JTextField();
	  adj3TF =new JTextField();
	  noun2TF =new JTextField();
	  adj4TF = new JTextField();
	  adj5TF = new JTextField();
	  noun3TF = new JTextField();
	  noun4TF = new JTextField();
	  
	  
	  
	  SaveButton = new JButton("Save all");
	  display = new JButton("Show Mad Lib!");
	  
	  // Add UI element to frame
	  GroupLayout layout = new GroupLayout(frame.getContentPane());
	  layout.setAutoCreateGaps(true);
	  layout.setAutoCreateContainerGaps(true);
	  layout.setHorizontalGroup(layout.createSequentialGroup()
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(adj1Label)
	    .addComponent(verbLabel)
	    .addComponent(adj2Label)
	    .addComponent(nounLabel)
	    .addComponent(verb2Label)
	    .addComponent(adj3Label)
	    .addComponent(noun2Label)
	    .addComponent(adj4Label)
	    .addComponent(adj5Label)
	    .addComponent(noun3Label)
	    .addComponent(noun4Label))
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(adj1TF)
	    .addComponent(verb1TF).addComponent(adj2TF).addComponent(noun1TF).addComponent(verb2TF).addComponent(adj3TF).addComponent(noun2TF).addComponent(adj4TF).addComponent(adj5TF).addComponent(noun3TF).addComponent(noun4TF))
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(SaveButton)
	    )
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(display)
	    ));
	  layout.setVerticalGroup(layout.createSequentialGroup()
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(adj1Label)
	    .addComponent(adj1TF).addComponent(SaveButton).addComponent(display))
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(verbLabel)
	    .addComponent(verb1TF))
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(adj2Label)
	    	    .addComponent(adj2TF))
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(nounLabel)
	    	    .addComponent(noun1TF))
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(verb2Label)
	    	    .addComponent(verb2TF))
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(adj3Label)
	    	    .addComponent(adj3TF))
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(noun2Label)
	    	    .addComponent(noun2TF))
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(adj4Label)
	    	    .addComponent(adj4TF))
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(adj5Label)
	    	    .addComponent(adj5TF))
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(noun3Label)
	    	    .addComponent(noun3TF))
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(noun4Label)
	    	    .addComponent(noun4TF))
	    );
	  layout.linkSize(SwingConstants.HORIZONTAL, SaveButton);
	  layout.linkSize(SwingConstants.HORIZONTAL, display);
	  frame.getContentPane().setLayout(layout);
	 }
	 public JFrame getFrame() {
	  return frame;
	 }
	 public void setFrame(JFrame frame) {
	  this.frame = frame;
	 }

	 public JButton getSaveButton() {
	  return SaveButton;
	 }
	 public void setSaveButton(JButton SaveButton) {
	  this.SaveButton = SaveButton;
	 }
	 
	 

	 public JButton getDisplay() {
	  return display;
	 }
	 public void setDisplay(JButton display) {
	  this.display = display;
	 }

}
