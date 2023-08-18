package com.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
	
	//Adding Log statement
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	
	//we are going to check weather this test process is automated or not with the help of this Jenkins.

	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true, true); //checking this test case is executing or not.
	}

}
