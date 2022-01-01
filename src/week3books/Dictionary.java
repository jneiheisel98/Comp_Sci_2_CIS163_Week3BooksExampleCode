package week3books;
//********************************************************************
//  Dictionary.java       Author: Lewis/Loftus
//
//  Represents a dictionary, which is a book. Used to demonstrate
//  inheritance.
//********************************************************************

public class Dictionary extends Book
{
	protected int definitions = 52500;
	protected int pages;

	public Dictionary (int def) {
		super (300);
		definitions = def;
		pages = 12;

		//setPages(12);
		super.pages = 120;
		super.setPages(12);


	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double computeRatio ()
	{
		return definitions/getPages();
	}

	public void setDefinitions (int numDefinitions)
	{
		definitions = numDefinitions;
	}

	public int getDefinitions ()
	{
		return definitions;
	}

}
