package HTwoDb.EmpServiceIn;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HTwoDb.Emprepo.EmpRepo;
import HTwoDb.model.Employee;

@Service
public class EmpImpl implements EmpServicIn {
    @Autowired
	private EmpRepo empRepo;
   
	
	@Override
	public Employee saveEmp(Employee save) {
		// TODO Auto-generated method stub
		return empRepo.save(save);
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public Employee update(int id, Employee newdata) {
		// TODO Auto-generated method stub
		Optional<Employee> byId = empRepo.findById(id);
		if (byId.isPresent()) {
			Employee emp=byId.get();
			emp.setCity(newdata.getCity());
			emp.setNamee(newdata.getNamee());
			
			return empRepo.save(emp);
		}
	 throw new RuntimeException("Data Not found!!");
	}

	@Override
	public void deleteById(int id) {
		
		empRepo.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		empRepo.deleteAll();
	}

}
