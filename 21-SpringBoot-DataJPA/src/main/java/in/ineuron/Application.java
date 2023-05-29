package in.ineuron;

import in.ineuron.bo.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.service.StudentServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext factory=SpringApplication.run(Application.class, args);
		StudentServiceImpl service=factory.getBean(StudentServiceImpl.class);
		Student student=new Student(null,"rohit",50,"MI");
		
		System.out.println(service.regStudent(student));
	}

}
