package emp_sorters;

import java.util.Comparator;

public class EmpIdDescComparator implements Comparator<employee> {

	@Override
	public int compare(employee e1, employee e2) {
		// TODO Auto-generated method stub
		if(e1.getEmpId()> e2.getEmpId()) {
			return -1;
		}else if(e1.getEmpId()< e2.getEmpId()){
		return 1;
		}else {
			return 0;
		}
	}

}
