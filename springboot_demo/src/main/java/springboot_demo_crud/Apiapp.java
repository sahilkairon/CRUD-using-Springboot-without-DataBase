package springboot_demo_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages= {"springboot_demo_crud_controller", "springboot_demo_crud"})
public class Apiapp {
	public static void main(String[] args) {
	SpringApplication.run(Apiapp.class, args);

	}

}
