package emp_sorters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoEmployeeList {

	public static void main(String[] args) {
		List<employee> empList = new ArrayList<>();
		empList.add(new employee(101, "Kaif", 100000, 2));
		empList.add(new employee(102, "Saqlain", 50000, 1));
		empList.add(new employee(103, "Meerasab", 30000, 6));
		empList.add(new employee(104, "Shoaib", 70000, 3));
		empList.add(new employee(102, "Faizan", 14000, 4));
		System.out.println("Before Sorting");
		System.out.println(empList);
		
		System.out.println("Ascending Order Sorting= Experience");
		Collections.sort(empList,new EmpExperienceAscComparator());
		System.out.println(empList);
		
		System.out.println("Descending Order Sorting= Experience");
		Collections.sort(empList,new EmpExperienceDescComparator());
		System.out.println(empList);
		
		 System.out.println("Ascending Order Sorting= Name");
		 Collections.sort(empList,new EmpNameAscComparator());
		 System.out.println(empList);
		 
		 System.out.println("Descending Order Sorting= Name");
		 Collections.sort(empList,new EmpNameDescComparator());
		 System.out.println(empList);
		
		System.out.println("Ascending Order Sorting= EmpId");
		Collections.sort(empList,new EmpIdAscComparator());
		System.out.println(empList);
		
		System.out.println("Descending Order Sorting= EmpId");
		Collections.sort(empList,new EmpIdDescComparator());
		System.out.println(empList);
		
		System.out.println("Ascending Order Sorting= Salary");
		Collections.sort(empList,new EmpSalaryAscComparator());
		System.out.println(empList);
		
		System.out.println("Descending Order Sorting= Salary");
		Collections.sort(empList,new EmpSalaryDescComparator());
		System.out.println(empList);
		

	}

}
