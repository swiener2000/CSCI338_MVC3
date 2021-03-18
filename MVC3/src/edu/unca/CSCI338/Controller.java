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
	  view.getFirstnameSaveButton().addActionListener(e -> saveFirstname());
	 // view.getLastnameSaveButton().addActionListener(e -> saveLastname());
	  view.getHello().addActionListener(e -> showMadLib());
	 // view.getBye().addActionListener(e -> sayBye());
	 }
	 
	 private void saveFirstname() {
	  model.setAdj1(view.getAdj1TF().getText());
	  model.setVerb1(view.getVerb1TF().getText());
	  JOptionPane.showMessageDialog(null, "All Fields Saved", "Info", JOptionPane.INFORMATION_MESSAGE);
	 }
//	 private void saveLastname() {
//	  model.setVerb1(view.getVerb1TF().getText());
//	  JOptionPane.showMessageDialog(null, "Lastname saved : " + model.getVerb1(), "Info", JOptionPane.INFORMATION_MESSAGE);
//	 }
	 
	 
	 
	 private void showMadLib() {
	  JOptionPane.showMessageDialog(null, "Our school dining hall has really " + model.getAdj1() + " food. Just thinking about it makes my stomach " + model.getVerb1() + ".", "Info", JOptionPane.INFORMATION_MESSAGE);
	 }
//	 private void sayBye() {
//	  System.exit(0);
//	 }
}
