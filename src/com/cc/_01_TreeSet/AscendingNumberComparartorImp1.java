package com.cc._01_TreeSet;

import java.util.Comparator;

public class AscendingNumberComparartorImp1 implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1>o2) {
			return 1;
		}else if(o2<o1){
			return -1;
		}else {
			return 0;
		}
	}
	
	

}
