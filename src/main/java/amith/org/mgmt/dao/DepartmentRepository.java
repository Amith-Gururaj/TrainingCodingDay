package amith.org.mgmt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import amith.org.mgmt.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>
{
	//@Query("")
	//public String getDeptOfEmp();
}
