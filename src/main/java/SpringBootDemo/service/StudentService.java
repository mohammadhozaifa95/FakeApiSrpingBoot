package SpringBootDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringBootDemo.ServiceIn.StudentServiceIn;
import SpringBootDemo.model.Student;
import SpringBootDemo.repo.StudRepo;

@Service
public class StudentService implements  StudentServiceIn {
@Autowired
private StudRepo repo;
	@Override
	public Student saveData(Student save) {
		// TODO Auto-generated method stub
		return repo.save(save);
	}

	@Override
	public List<Student> gatAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Student getById(Integer id) {
		System.out.println("getAll data");
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(()-> new RuntimeException("ID NOT FOUND"));

	}

	@Override
	public Student Update(Integer id, Student neWStudent) {
		// TODO Auto-generated method stub
		Optional<Student> byId = repo.findById(id);
		if (byId.isPresent()) {
			Student student=byId.get();
			student.setName(neWStudent.getName());
			student.setCity(neWStudent.getCity());
			student.setEmail(neWStudent.getEmail());
			
			return repo.save(student);
		}
		
	throw new RuntimeException("ID IS EMPTY");
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		repo.deleteAll();
		
	}

}
