package edu.unca.csci338;
import javax.swing.JOptionPane;

public class MVCTestController {
	private MVCTestModel model;
	private MVCTestView view;
	
	/**
	 * constructor
	 */
     public MVCTestController(MVCTestModel m, MVCTestView v) {
    	 model = m;
    	 view = v;
    	
     }
     
     public void run() {
    	 
    	model.setName1( view.getNameText().getText());
    	view.getSubmit().addActionListener(e -> LibIt());
     }

	private void LibIt() {
		JOptionPane.showMessageDialog(null, "my name is:" + model.getName1(), "Libs", JOptionPane.INFORMATION_MESSAGE);
		
		
	}

}
