package HTwoDb.EmpServiceIn;

import java.util.List;

import HTwoDb.model.Employee;

public interface EmpServicIn {

	 //Save method 
	public Employee saveEmp(Employee save);
	
	//get All method
	public List<Employee> getAll();
	//update
	public Employee update(int id,Employee newdata);
	
	//deleteById
	public void deleteById(int id );
	
	//DeleteAll
	public void deleteAll();
	
	
}
