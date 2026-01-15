package SpringBootDemo.ServiceIn;

import java.util.List;

import SpringBootDemo.model.Student;


public interface StudentServiceIn {

	public Student saveData(Student save);
	public List<Student> gatAll();
	public Student getById(Integer id);
	public Student Update(Integer id,Student neWStudent);
	public void delete(Integer id);
	
	public void deleteAll();
}

