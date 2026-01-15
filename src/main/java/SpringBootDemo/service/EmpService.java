package SpringBootDemo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import SpringBootDemo.ServiceIn.EmpServiceIn;
import SpringBootDemo.model.Employee;

@Service
public class EmpService implements EmpServiceIn {

	private static List<Employee> emp = new ArrayList<>();

	public EmpService() {
		emp.add(new Employee(1, "Mohammad", "Sakinaka","khanmod@gmail.com","huz123",1232.00,18));
		emp.add(new Employee(2, "Mohammad", "Sakinaka","khanmod@gmail.com","huz123",1232.00,18));
		emp.add(new Employee(3, "Mohammad", "Sakinaka","khanmod@gmail.com","huz123",1232.00,18));
	}
	
	//public void pay(){}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return emp;
	}
	
	@Override
	public Employee saveEmp(Employee employee) {
		// TODO Auto-generated method stub
		emp.add(employee);
		return employee;
	}

	@Override
	public Employee getById(int id) {
		
		
		
		// TODO Auto-generated method stub
		for (Employee employee : emp) {
			
			if (employee.getId() == id) {
				return employee;
			}
		}
		return null;
	}
	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		Iterator<Employee> itr = emp.iterator();
		while (itr.hasNext()) {
			Employee employee = itr.next();

			if (employee.getId() == id) {
				itr.remove();

				return "Employee deleted Success";
			}
		}
		return "Employee Not found";
	}

	@Override
	public String update(Employee empl) {
		// TODO Auto-generated method stub
		for (Employee existing  : emp) {
			if (existing.getId()==empl.getId()) {
		       existing.setAddress(empl.getAddress());
		       existing.setName(empl.getName());
		       return "Update Successfully";
			}
		}
		return "Emp Not found";
	}

}
