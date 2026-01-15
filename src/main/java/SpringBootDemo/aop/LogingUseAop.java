package SpringBootDemo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogingUseAop {

	//@pointcut
	
	@Pointcut("execution(* SpringBootDemo.service.EmpService.*(..))")
	public void m1() {}
	
	@After("execution(* SpringBootDemo.controller.EmpController.getById(..))")
	public void handle() {
		System.out.println("Aply Aop getBy Id");
	}
	
	@Around("execution(* SpringBootDemo.service.EmpService.*(..))")
	public Object aroud(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("Apply Around");
		  Object proceed = jp.proceed();
		return proceed;
		
	}
	
	@AfterReturning(value ="execution(* SpringBootDemo.service.EmpService.getAll(..))",
	returning = "result")
	
public void handle1() {
	System.out.println("Hello runing success..");	
	}

	@AfterThrowing(value="execution(* SpringBootDemo.controller.EmpController.getById(..))"
	,throwing ="e")
	public void n1(Exception e) {
		
	System.out.println("Exception "+e.getMessage());
	
	}
	
	
}
