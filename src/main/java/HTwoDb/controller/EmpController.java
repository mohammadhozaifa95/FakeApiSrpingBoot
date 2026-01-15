package HTwoDb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import HTwoDb.EmpServiceIn.EmpServicIn;
import HTwoDb.model.Employee;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name ="This controller")
public class EmpController {
	
    @Autowired
	private EmpServicIn empServicIn;
    
    @Operation(summary = "Post Api For Saving Data")
    @PostMapping("/savedata")
    public Employee save(@RequestBody Employee save) {
	return empServicIn.saveEmp(save);
    	
    }
    @GetMapping("/get")
    public List<Employee> getAll(){
    
	return 	empServicIn.getAll();
    	
    }
	
}
