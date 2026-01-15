package SpringBootDemo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import SpringBootDemo.ServiceIn.StudentServiceIn;
import SpringBootDemo.model.Student;
import tools.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api")
public class StudentController {
@Autowired
private StudentServiceIn savedata;

@PostMapping("/save")
public Student save(@RequestPart String save,@RequestPart MultipartFile image,@RequestPart MultipartFile pdf) throws IOException {
	  ObjectMapper mapper=new ObjectMapper();
	  Student value = mapper.readValue(save, Student.class);
	value.setImage(image.getBytes());
	value.setPdf(pdf.getBytes());
return savedata.saveData(value);
	
}
@GetMapping("/getAll")
public List<Student> getAll(){
	return savedata.gatAll();
	
}//
   @GetMapping("/get/{id}")
  public ResponseEntity<byte[]> findById(@PathVariable Integer id) {	
  Student byId = savedata.getById(id);
  return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(byId.getImage());
  }
@PutMapping("/updte/{id}")
public Student Update(@PathVariable Integer id,@RequestBody Student newstude) {
	return savedata.Update(id, newstude);
	
}
@DeleteMapping("/delete/{id}")
public void delete(@PathVariable Integer id) {
	savedata.delete(id);
	
}
@DeleteMapping("/All")
public void deleteAll() {
	savedata.deleteAll();
}
}

