package com.example.demo; // package name is the name of the folder where the file is located

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongorestApplication { // This is the main class while MongorestApplication.java is the main file

	public static void main(String[] args) { // This is the main method which is the entry point of the application

		SpringApplication.run(MongorestApplication.class, args); // This is the method which starts the application
	}

}
