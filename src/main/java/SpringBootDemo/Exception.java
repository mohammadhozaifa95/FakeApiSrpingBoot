package SpringBootDemo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Exception {

@ExceptionHandler(exception =MethodArgumentNotValidException.class)
public Map<String, String> handle(MethodArgumentNotValidException ex){
	
	HashMap<String, String> error=new HashMap<>();
	ex.getBindingResult().getFieldErrors().forEach(err ->
	error.put(err.getField(), err.getDefaultMessage()));
	
			       
	return error;
	
}
}
