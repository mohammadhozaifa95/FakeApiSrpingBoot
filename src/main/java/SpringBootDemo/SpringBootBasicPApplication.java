package SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpringBootBasicPApplication  {
public static void main(String[] args) {
	

   SpringApplication.run(SpringBootBasicPApplication.class, args);
   
   // bean.saveAll(of);
	
	//  List<Employee> allEmp = bean.getAllEmp(); 
	 // System.out.println(allEmp);
  // List<Employee> byNameAndAddress = bean.getByNameAndAddress("Yasir", "kurla");
  // System.out.println(byNameAndAddress);
   
 // int updateEmp = bean.UpdateEmp("Yasir",6);
   //bean.delete(1);
     
	 
	}
	
}
