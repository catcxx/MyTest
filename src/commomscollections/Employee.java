package commomscollections;
/**
 * Ա����
 * @author Administrator
 *
 */
public class Employee {
	private String name;
	private double salary;
	//alt +/
	public Employee() {
	}
	//alt+shift+s  o
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	//alt+shift+s  +r tab �س� shift+tab �س�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "(��ũ:"+this.name+",��שǮ:"+this.salary+")";
	}
	
}
