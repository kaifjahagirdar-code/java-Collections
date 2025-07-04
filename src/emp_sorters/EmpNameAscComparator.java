package emp_sorters;

import java.util.Comparator;

public class EmpNameAscComparator implements Comparator<employee>{

	@Override
	public int compare(employee e1, employee e2) {
		if(e1.getEmpName().compareTo(e2.getEmpName())>0) {
			return 1;
		}else if(e1.getEmpName().compareTo(e2.getEmpName())<0){
			return -1;
		}else {
			return 0;
		}
		
	}

}
