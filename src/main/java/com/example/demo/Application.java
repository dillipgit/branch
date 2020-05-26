package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Application.main()");

                   int x=0;
                   int y = 10;
               System.out.println("y"+y);
               System.out.println("x"+x);

	}

}
