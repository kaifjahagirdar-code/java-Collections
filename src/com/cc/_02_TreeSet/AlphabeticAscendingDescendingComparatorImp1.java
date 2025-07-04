package com.cc._02_TreeSet;

import java.util.Comparator;

public class AlphabeticAscendingDescendingComparatorImp1 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		
			// return o1.compareTo(o2);
		return -o1.compareTo(o2);
		}
	
	}





