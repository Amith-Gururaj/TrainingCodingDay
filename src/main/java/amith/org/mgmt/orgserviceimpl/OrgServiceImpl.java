package amith.org.mgmt.orgserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import amith.org.mgmt.dao.DepartmentRepository;
import amith.org.mgmt.dao.Employee_DetailsRepository;
import amith.org.mgmt.dto.GetDeptOfEmp;
import amith.org.mgmt.model.Department;
import amith.org.mgmt.model.Employee_Details;
import amith.org.mgmt.orgservice.OrgService;

@Service
public class OrgServiceImpl implements OrgService 
{
	@Autowired
	private Employee_DetailsRepository emprepo; // Creating a object through Dependency Injection
	
	@Autowired
	private DepartmentRepository deptrepo;
	
	public OrgServiceImpl(Employee_DetailsRepository emprepo, DepartmentRepository deptrepo) {
		super();
		this.emprepo = emprepo;
		this.deptrepo = deptrepo;
	}

	@Override
	public Iterable<Employee_Details> getAllEmployees() 
	{
		return emprepo.findAll();
	}

	@Override
	public Iterable<Department> getAllDepartments() 
	{
		return deptrepo.findAll();
	}

	@Override
	public Employee_Details getEmployeeById(int id) 
	{
		return emprepo.getById(id);
	}

	@Override
	public Department getDepartmentById(int id) 
	{
		return deptrepo.getById(id);
	}

	@Override
	public String addEmployee(Employee_Details emp) 
	{
		emprepo.save(emp);
		return "Employee Data Saved Successfully";
	}

	@Override
	public String addDepartment(Department dept) 
	{
		deptrepo.save(dept);
		return "Department Data Saved Successfully";
	}

	@Override
	public Iterable<GetDeptOfEmp> getEmpDept() {
//		return emprepo.getDeptOfEmp();
		return null;
	}
	

}
