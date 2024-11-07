package com.nachi.mydemo.app;

import java.util.Comparator;

public class FireFlixLastNameComparator implements Comparator<FireFlixUsers>{
	
	@Override
	public int compare(FireFlixUsers f1,FireFlixUsers f2) {
		return f2.email.compareTo(f1.email);
	}
}
