package amith.org.mgmt.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee_Details 
{
	@Id
	private int eid; // Primary Key of Employee_Details table
	
	private String name;
	private int salary;
	
	@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="dept_id",referencedColumnName="dept_id")
	private Department dept; // Department Object is created and its going to be cascaded in Department table
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee_Details [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
