package HTwoDb.Emprepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import HTwoDb.model.Employee;

@Repository
public interface EmpRepo  extends JpaRepository<Employee, Integer>{

}
