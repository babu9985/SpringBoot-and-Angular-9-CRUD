package com.example.crudEx1;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class CrudEx1Application {

	public static void main(String[] args) {
		SpringApplication.run(CrudEx1Application.class, args);
	}
	
	
	
//	CommandLineRunner init(UserRepository urepo) {
//		return args ->{
//			Stream.of("john","Julie","Jennifer","babu","ganesh").forEach(name ->{
//				User user = new User(name, name.toLowerCase()+ "@domain.com");
//				urepo.save(user);
//			});
//		};
//	}
	
	

}
