package SpringBootDemo.ServiceIn;

import java.util.List;

import SpringBootDemo.model.Employee;

public interface EmpServiceIn {

	public List<Employee> getAll();
	
	public Employee saveEmp(Employee employee);
	
	public Employee getById(int id);
	
	public String delete(int id);
	
	public String update(Employee emp);
	
	
}
