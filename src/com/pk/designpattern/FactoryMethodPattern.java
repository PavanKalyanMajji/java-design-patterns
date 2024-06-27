package com.pk.designpattern;

abstract class Btech {
	protected String branchName;

	public abstract void setBranchName();

	public void getBranchName() {
		System.out.println(branchName);
	}
}

class MechanicalEngineering extends Btech {

	@Override
	public void setBranchName() {
		branchName = "Mechanical Engineering";
	}

}

class ComputerScienceEngineering extends Btech {

	@Override
	public void setBranchName() {
		branchName = "Computer Science Engineering";
	}

}

class CivilEngineering extends Btech {

	@Override
	public void setBranchName() {
		branchName = "Civil Engineering";
	}

}

class FactoryClass {

	protected Btech btech;

	public FactoryClass(String branchName) {
		if (branchName.equals(null)) {
			this.btech = null;
		} else if (branchName.equalsIgnoreCase("CSE")) {
			this.btech = new ComputerScienceEngineering();
		} else if (branchName.equalsIgnoreCase("CIVIL")) {
			this.btech = new CivilEngineering();
		} else if (branchName.equalsIgnoreCase("MECHANICAL")) {
			this.btech = new MechanicalEngineering();
		} else {
			this.btech = null;
		}

	}

	public Btech getBtechObject() {
		return this.btech;
	}

}

public class FactoryMethodPattern {
	public static void main(String[] args) {
		FactoryClass factoryClass = new FactoryClass("cse");
		Btech btech = factoryClass.getBtechObject();
		btech.setBranchName();

		btech.getBranchName();
	}
}
