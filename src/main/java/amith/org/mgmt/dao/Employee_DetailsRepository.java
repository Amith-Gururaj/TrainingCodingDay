package amith.org.mgmt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import amith.org.mgmt.dto.GetDeptOfEmp;
import amith.org.mgmt.model.Employee_Details;

@Repository
public interface Employee_DetailsRepository extends JpaRepository<Employee_Details, Integer>
{
//	@Query("SELECT new amith.org.mgmt.dto.GetDeptOfEmp(e.name,d.dept_name) FROM Employee_Details e JOIN e.department d")
//	public List<GetDeptOfEmp> getDeptOfEmp();
}
