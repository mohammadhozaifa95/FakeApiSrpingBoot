package SpringBootDemo.model;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class Employee{
	
@Positive(message = "Id Should be positive")
@NotNull(message ="Id should not null")
private Integer id;

@NotBlank(message = "Name can not blank")
@Size(min = 3,max = 10 ,message = "Name should be 10 charecter")
private String name;

@NotEmpty(message = "Address can not empty")//
@NotBlank(message = "Address can not Blank")//
@Size(min=4,max = 12,message = "Address should be 12 charecter")
private String address;

@Email(message ="mandatary to email format")
private String email;

@NotBlank
@Size(min =5,max = 10, message ="Password should be 10 charecter")
private String password;
@Digits(integer =2,fraction =10,message ="Slary fomat is mendatory...")
private Double salary;

@Positive(message ="Age shuld be posstive")
@Min(value = 18 ,message = "Age should be 18 +")
@Max(value = 60,message = "Age should be <60")
private Integer age;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Double getSalary() {
	return salary;
}

public void setSalary(Double salary) {
	this.salary = salary;
}

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}



public Employee(@Positive(message = "Id Should be positive") @NotNull(message = "Id should not null") Integer id,
		@NotBlank(message = "Name can not blank") @Size(min = 3, max = 10, message = "Name should be 10 charecter") String name,
		@NotEmpty(message = "Address can not empty") @NotBlank(message = "Address can not Blank") @Min(value = 4, message = "mandataroy to 4 charecter") @Max(value = 12, message = "maxcimum 12 charecter") String address,
		@Email(message = "mandatary to email format") String email,
		@NotBlank @Size(min = 5, max = 10, message = "Password should be 10 charecter") String password,
		@Digits(integer = 2, fraction = 10, message = "Slary fomat is mendatory...") Double salary,
		@Positive(message = "Age shuld be posstive") @Min(value = 18, message = "Age should be 18 +") @Max(value = 60, message = "Age should be <60") Integer age) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.email = email;
	this.password = password;
	this.salary = salary;
	this.age = age;
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", password="
			+ password + ", salary=" + salary + ", age=" + age + "]";
}





}
