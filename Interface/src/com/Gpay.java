package com;

public interface Gpay {
	void pay();
	static void reward() {
		System.out.println("This is reward");
	}
}

interface  Uber extends Gpay {
	void bookCab();
}
