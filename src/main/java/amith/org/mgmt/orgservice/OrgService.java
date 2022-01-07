package amith.org.mgmt.orgservice;

import amith.org.mgmt.dto.GetDeptOfEmp;
import amith.org.mgmt.model.Department;
import amith.org.mgmt.model.Employee_Details;

public interface OrgService 
{
	public Iterable<Employee_Details> getAllEmployees();
	public Iterable<Department> getAllDepartments();
	
	public Employee_Details getEmployeeById(int id);
	public Department getDepartmentById(int id);
	
	public String addEmployee(Employee_Details emp);
	public String addDepartment(Department dept);
	
	public Iterable<GetDeptOfEmp> getEmpDept();
}
