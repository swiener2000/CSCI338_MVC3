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
		  JOptionPane.showMessageDialog(null, "Before you set your phasers to " + model.getNoun1() + 
		  " you’ve got a lot to do before you " + model.getVerb1() + 
		  " Starfleet Academy.\n "
	             + "First of all, you’ve have to leave your old " + model.getNoun2() + ". "
	             + "It’s not all exotic " + model.getAdj1() + " aliens and Romulan " + model.getNoun3()
	             + "Life at Starfleet Academy is not " + model.getAdj2() + " all the time. \n"
	             + "You’ll meet all kind of new " + model.getAdj3() + " ensign. \n"
	             + "And remember, " + model.getAdj4() + "hotshots such as James T. Kirk have passed through this "  + model.getNoun4() + ".\n"
	             + "You could be " + model.getAdj5() + ".\n" 
		      + model.getVerb2() + "to Starfleet Academy!\n"
	             , "Info", JOptionPane.INFORMATION_MESSAGE);
		 }

}
