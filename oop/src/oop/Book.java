package oop;

public class Book {

	private int noOfCopies;

	Book() {
		this(5);
	}
	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 1)
			this.noOfCopies = this.noOfCopies + noOfCopies;

	}

	public void increaseCopies(int copies) {
		setNoOfCopies(this.noOfCopies + copies);
	}

	public void decreaseCopies(int copies) {
		setNoOfCopies(this.noOfCopies - copies);
	}


}
