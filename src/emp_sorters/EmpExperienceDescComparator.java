package emp_sorters;

import java.util.Comparator;

public class EmpExperienceDescComparator implements Comparator<employee> {

	@Override
	public int compare(employee e1, employee e2) {
		// TODO Auto-generated method stub
		if(e1.getExperience()> e2.getExperience()) {
			return -1;
		}else if(e1.getExperience()< e2.getExperience()){
		return 1;
		}else {
			return 0;
		}
	}

}
