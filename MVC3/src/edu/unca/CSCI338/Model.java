package edu.unca.CSCI338;

public class Model {
//	 private String firstname;
//	 private String lastname;
	 private String adj1;
	 private String verb1;
	 private String adj2;
	 private String noun1;
	 private String verb2;
	 private String adj3;
	 private String noun2;
	 private String adj4;
	 private String adj5;
	 private String noun3;
	 private String noun4;
	 
	 //public Model(String firstname, String lastname) {
	 public Model(String adj1, String verb1, String adj2, String noun1, String verb2, String adj3, String noun2, String adj4, String adj5, String noun3, String noun4) {
		 this.adj1 = adj1;
		 this.verb1 = verb1;
		 this.adj2 = adj2;
		 this.noun1 = noun1;
		 this.verb2 = verb2; 
		 this.adj3 = adj3;
		 this.noun2 = noun2;
		 
		 this.adj4 = adj4;
		 this.adj5 = adj5;
		 this.noun3 = noun3;
		 this.noun4 = noun4;
	 }
		 
	public String getAdj1() {
		return adj1;
	}

	public void setAdj1(String adj1) {
		this.adj1 = adj1;
	}

	public String getVerb1() {
		return verb1;
	}

	public void setVerb1(String verb1) {
		this.verb1 = verb1;
	}

	public String getAdj2() {
		return adj2;
	}

	public void setAdj2(String adj2) {
		this.adj2 = adj2;
	}

	public String getNoun1() {
		return noun1;
	}

	public void setNoun1(String noun1) {
		this.noun1 = noun1;
	}

	public String getVerb2() {
		return verb2;
	}

	public void setVerb2(String verb2) {
		this.verb2 = verb2;
	}

	public String getAdj3() {
		return adj3;
	}

	public void setAdj3(String adj3) {
		this.adj3 = adj3;
	}

	public String getNoun2() {
		return noun2;
	}

	public void setNoun2(String noun2) {
		this.noun2 = noun2;
	}

	public String getAdj4() {
		return adj4;
	}

	public void setAdj4(String adj4) {
		this.adj4 = adj4;
	}

	public String getAdj5() {
		return adj5;
	}

	public void setAdj5(String adj5) {
		this.adj5 = adj5;
	}

	public String getNoun3() {
		return noun3;
	}

	public void setNoun3(String noun3) {
		this.noun3 = noun3;
	}

	public String getNoun4() {
		return noun4;
	}

	public void setNoun4(String noun4) {
		this.noun4 = noun4;
	}
}
