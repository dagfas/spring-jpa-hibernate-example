package com.example.springjpahibernateexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//line below (Enable... ia manually added) --it is to help spring boot where the repository file is located
//So then during initialization stage it will load and does whatever it needs to
//we copied and paste the link from the User
@EnableJpaRepositories (basePackages = "com.example.springjpahibernateexample.repository")
@SpringBootApplication
public class SpringJpaHibernateExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaHibernateExampleApplication.class, args);
	}

}
