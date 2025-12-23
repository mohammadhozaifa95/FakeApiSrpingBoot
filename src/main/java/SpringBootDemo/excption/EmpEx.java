package SpringBootDemo.excption;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmpEx {

@ExceptionHandler(exception =MethodArgumentNotValidException.class)
public Map<String, String> handle(MethodArgumentNotValidException ex){
	
	HashMap<String, String>map=new HashMap<>();
	ex.getBindingResult().getAllErrors().forEach(err-> map.put(err.getCode(), err.getDefaultMessage()));
	return map;
	
}
@ExceptionHandler(exception = Exception.class)
public String ex(Exception ex) {
	ex.printStackTrace();
	System.out.println(ex.getMessage());
	return "Exception Occure";
	
}
}
