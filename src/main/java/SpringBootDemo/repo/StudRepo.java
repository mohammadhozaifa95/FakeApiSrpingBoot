
 package SpringBootDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringBootDemo.model.Student;

@Repository
public interface StudRepo extends JpaRepository < Student, Integer> {
 }