package com.ibcompsci_ia.Bible;

import java.util.ArrayList;

public class Chapter {
	//has an arraylist of verses
	private ArrayList<String> verses;
	public String bookName;
	public int chapNo;
	
	public Chapter(String bookName, int chapNo){
		this.bookName = bookName;
		this.chapNo = chapNo;
		verses = new ArrayList<>();
	}
	
}