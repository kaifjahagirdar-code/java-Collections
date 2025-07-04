package com.cc._01_TreeSet;

import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // TreeSet<Integer> set= new TreeSet<>();
       // TreeSet<Integer> set= new  TreeSet<>(new AscendingNumberComparartorImp1());
		TreeSet<Integer> set= new  TreeSet<>(new DescendingNumberComparatorImp1());
        set.add(10);
        set.add(5);
        set.add(0);
        set.add(15);
        set.add(20);
        set.add(20);
        System.out.println(set);
	}

}
