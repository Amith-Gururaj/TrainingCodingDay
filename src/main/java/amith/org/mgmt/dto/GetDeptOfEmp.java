package amith.org.mgmt.dto;

public class GetDeptOfEmp 
{
	private String name;
	private String dept_name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public GetDeptOfEmp(String name, String dept_name) {
		super();
		this.name = name;
		this.dept_name = dept_name;
	}
	public GetDeptOfEmp() {
		super();
	}
	
}
