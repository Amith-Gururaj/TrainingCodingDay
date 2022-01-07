package amith.org.mgmt.orgcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import amith.org.mgmt.dto.GetDeptOfEmp;
import amith.org.mgmt.model.Department;
import amith.org.mgmt.model.Employee_Details;
import amith.org.mgmt.orgservice.OrgService;

@RestController
@RequestMapping(path="/org")
public class OrgController 
{
	@Autowired
	private OrgService obj;

	public OrgController(OrgService obj) {
		super();
		this.obj = obj;
	}
		@GetMapping(path="/getallemp")
		public @ResponseBody Iterable<Employee_Details> getAll()
		{
			return obj.getAllEmployees();
		}
		
		@GetMapping(path="/getempbyid")
		public Employee_Details getEmpById(@RequestParam int id)
		{
			return obj.getEmployeeById(id);
		}
		
		@PostMapping(path="/addemp")
		public @ResponseBody String addEmployee(@RequestBody Employee_Details emp)
		{
			return obj.addEmployee(emp);
		}
	
		@GetMapping(path="/getalldept")
		public Iterable<Department> getAllDepartments()
		{
			return obj.getAllDepartments();
		}
		
		@GetMapping(path="/getdeptbyid")
		public Department getDeptById(@RequestParam int id)
		{
			return obj.getDepartmentById(id);
		}
		
		@PostMapping(path="/adddept")
		public @ResponseBody String addDepartment(@RequestBody Department dept)
		{
			return obj.addDepartment(dept);
		}
		
		@GetMapping(path="/getdeptofemp")
		public @ResponseBody Iterable<GetDeptOfEmp> getDeptOfEmp()
		{
			return obj.getEmpDept();
		}
}
