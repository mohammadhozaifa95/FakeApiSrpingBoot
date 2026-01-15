package SpringBootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SpringBootDemo.ServiceIn.EmpServiceIn;
import SpringBootDemo.model.Employee;
import jakarta.validation.Valid;

@RestController
public class EmpController {

@Autowired
private  EmpServiceIn  empServiceIn;

//Get All data Form List
@GetMapping("/getAll")
public List<Employee> getAll(){
	System.out.println("Controller method");
return empServiceIn.getAll();
	
}
@PostMapping("/save")
public Employee saveDta(@Valid @RequestBody Employee employee) {
return empServiceIn.saveEmp(employee);
	
}

@GetMapping("/getById/{id}")
public Employee getById(@PathVariable("id") int id) {
	
	String s=null;
	System.out.println(s.length());
return empServiceIn.getById(id);
	
}
@DeleteMapping("/delete/{id}")
public String delete(@PathVariable("id") int id) {
	empServiceIn.delete(id);
	return "Delete Successfully";
	
}
@PutMapping("/update")
public String update(@Valid @RequestBody Employee employee) {
	empServiceIn.update(employee);
	return "Update Success";
	
}
}
