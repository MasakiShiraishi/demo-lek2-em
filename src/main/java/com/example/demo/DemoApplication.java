package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);
		isOfAge(-5, false, false, false);
	}

	public static boolean isOfAge(int age, boolean inCompanyOfAParent, boolean hasADog, boolean isBlind) throws Exception {

		if(age < 0){
			throw new Exception("Du kan inte vara under 0 år");
		}

		if(!isBlind && hasADog){
			return false;
		}
		else if(!inCompanyOfAParent && age < 20){
			return false;
		}
		return true;
	}


}
