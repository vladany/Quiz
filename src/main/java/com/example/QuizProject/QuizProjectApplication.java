package com.example.QuizProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.QuizProject.quiz")
public class QuizProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizProjectApplication.class, args);
	}

}
