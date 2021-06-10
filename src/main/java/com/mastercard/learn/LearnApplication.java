package com.mastercard.learn;

import com.mastercard.learn.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class LearnApplication {
	public static void main(String[] args) {
		SpringApplication.run(LearnApplication.class, args);
	}
}
