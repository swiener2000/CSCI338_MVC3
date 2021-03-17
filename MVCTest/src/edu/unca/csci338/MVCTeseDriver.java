package edu.unca.csci338;

public class MVCTeseDriver {
	
	public static void main (String[] args) {
		MVCTestModel m = new MVCTestModel("enter name");
		MVCTestView v = new MVCTestView();
		MVCTestController c = new MVCTestController(m, v);
		c.run();
	}

}
