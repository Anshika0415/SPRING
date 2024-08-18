package com.Anshika.demo;

import com.Anshika.demo.Model.Alien;
import com.Anshika.demo.Model.Laptop;
import com.Anshika.demo.Repository.LaptopRepo;
import com.Anshika.demo.Service.AppApplicationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		//IOC inversion of control. context helps to have connection with IOC container where objects are stored
		//Then we ask it to get the bean or object for Alien class
		ApplicationContext context=SpringApplication.run(AppApplication.class, args);

		Laptop lap=context.getBean(Laptop.class); //let this be a client request
		AppApplicationService service=context.getBean(AppApplicationService.class);
		//LaptopRepo repo=context.getBean(LaptopRepo.class);

		service.addLaptop(lap);
		//repo.saveLaptop(lap);
//		Alien a=context.getBean(Alien.class);
//		a.code();
//		System.out.println(a.getAge());
//		Alien b=context.getBean(Alien.class);
//		b.code(); //here a and b are same object
	}

}
