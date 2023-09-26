package com.kaps.employees;

import java.io.File;

import javax.annotation.PostConstruct;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.kaps.employees.controllers.EmployeeController;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class EmployeesApplicationTests {

	@Autowired
	EmployeeController employeeController;

	@Test
	public void contextLoads() {
		Assertions.assertThat(employeeController).isNotNull();
	    System.out.println("HEDO Working Directory = " + System.getProperty("user.dir"));
	    File dir = new File("/home/runner/work/fullstack-pipeline/fullstack-pipeline/target/");
	    String contents[] = dir.list();
	      System.out.println("HEDO List of files and directories in the specified directory:");
	      for(int i=0; i<contents.length; i++) {
	         System.out.println("HEDO: [" + contents[i] + "]");
	      }
		System.out.println("==============================================================");
		System.out.println("HEDO Employee Application Test: EmployeeController is not NULL");
		System.out.println("==============================================================");
	}
	
	@PostConstruct
	public void postConstructInit() {
		System.out.println("=========================================================");
		System.out.println("HEDO Employee Application Test: postConstructInit called.");
		System.out.println("=========================================================");

	}
}
