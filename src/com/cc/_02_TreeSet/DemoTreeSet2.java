package com.cc._02_TreeSet;

import java.util.TreeSet;

public class DemoTreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set= new  TreeSet<>(new AlphabeticAscendingDescendingComparatorImp1());
        set.add("Kaif");
        set.add("Ayaan");
        set.add("Mohin");
        set.add("Faizan");
        set.add("Junaid");
        set.add("Shoaib");
        System.out.println(set);
	}

}
