package com.fajar.springbootapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.fajar.springbootapi.controller.GeneralController;


@SpringBootTest
class SpringbootApiApplicationTest {

	@Test
	void contextLoads() {
		String resultHelloWorld = "Hello World";
		GeneralController generalController = new GeneralController();
		assertEquals(generalController.helloWorld(), resultHelloWorld);
	}
	
}
