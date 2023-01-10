package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.interfaces.UserRepo;
import com.example.demo.usecases.interactors.UserUseCase;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		UserUseCase uu = new UserUseCase(new UserRepo());
		System.out.println(uu.create("aa").getName());
	}

}
