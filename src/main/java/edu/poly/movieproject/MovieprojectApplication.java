package edu.poly.movieproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class MovieprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieprojectApplication.class, args);
	}

}
