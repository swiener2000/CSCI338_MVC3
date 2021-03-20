package edu.unca.CSCI338;
import javax.swing.JOptionPane;
public class Controller {
	private Model model;
	 private View view;
	 public Controller(Model m, View v) {
	  model = m;
	  view = v;
	  initView();
	 }
	 public void initView() {
	  view.getAdj1TF().setText(model.getAdj1());
	  view.getVerb1TF().setText(model.getVerb1());
	 }
	 public void initController() {
	  view.getSaveButton().addActionListener(e -> saveDisplay());
	  view.getDisplay().addActionListener(e -> showMadLib());
	 }
	 
	 private void saveDisplay() {
	  model.setAdj1(view.getAdj1TF().getText());
	  model.setVerb1(view.getVerb1TF().getText());
	  model.setAdj2(view.getAdj2TF().getText());
	  model.setNoun1(view.getNoun1TF().getText());
	  model.setVerb2(view.getVerb2TF().getText());
	  model.setAdj3(view.getAdj3TF().getText());
	  model.setNoun2(view.getNoun2TF().getText());
	  model.setAdj4(view.getAdj4TF().getText());
	  model.setAdj5(view.getAdj5TF().getText());
	  model.setNoun3(view.getNoun3TF().getText());
	  model.setNoun4(view.getNoun4TF().getText());
	  
	  
	  
	  
	   
	  
	  
	  
	  JOptionPane.showMessageDialog(null, "All Fields Saved", "Info", JOptionPane.INFORMATION_MESSAGE);
	 }

	 
	 
	 
	 private void showMadLib() {
	  JOptionPane.showMessageDialog(null, "Our school cafeteria has really " + model.getAdj1() + " food. Just thinking about it makes my stomach " + model.getVerb1() + ".\n " 
			  + "The spaghetti is " + model.getAdj2() + " and tastes like " + model.getNoun1() + ". "
			  + "One day, I swear one of my meatballs started to " + model.getVerb2() + "! \n"
			  + "The turkey tacos are totally " + model.getAdj3() + " and look kind of like old " + model.getNoun2() + ". \n"
			  + "My friend Dana actually likes the meatloaf, even though it's " + model.getAdj4() + " and " + model.getAdj5() + ". \n"
			  + "I call it \"mystery meatloaf\" and think it's really made out of " + model.getNoun3() + ". \n"
			  + "My dad said he'd make my lunches, but the first day, he made a sandwich out of " + model.getNoun4() + " and peanut butter! \n"
			  + "I think I'd rather take my chances with the cafeteria!"
			  , "Info", JOptionPane.INFORMATION_MESSAGE);
	 }

}
