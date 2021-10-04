package com.selflearn.springboot;

import com.selflearn.springboot.model.Employee;
import com.selflearn.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBasicsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBasicsApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Sajith");
		employee.setLastName("Sukumaran");
		employee.setEmailId("sajithkumar@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Sujith");
		employee1.setLastName("Sukumaran");
		employee1.setEmailId("sujithkumar@gmail.com");
		employeeRepository.save(employee1);

	}
}
