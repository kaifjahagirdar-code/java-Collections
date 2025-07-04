package emp_sorters;

public class employee {
	private int empId;
	private String empName;
	private double salary;
	private int experience;
	public employee(int empId, String empName, double salary, int experience) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.experience = experience;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", experience=" + experience
				+ "]\n";
	}
	
}
