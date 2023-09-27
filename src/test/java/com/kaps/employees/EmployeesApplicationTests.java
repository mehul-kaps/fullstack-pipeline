package com.kaps.employees;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

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

	    List<String> listOfFilesList = new ArrayList<>();
	    listf(System.getProperty("user.dir"), listOfFilesList);
	    for(String filePath : listOfFilesList) {
	    	System.out.println("HEDO [" + filePath.toString() + "]");
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
	
	
	public void listf(String directoryName, List<String> files) {
	    File directory = new File(directoryName);

	    // Get all files from a directory.
	    File[] fList = directory.listFiles();
	    if(fList != null)
	        for (File file : fList) {      
	            if (file.isFile()) {
	                files.add(file.getAbsolutePath());
	            } else if (file.isDirectory()) {
	                listf(file.getAbsolutePath(), files);
	            }
	        }
	}
}
