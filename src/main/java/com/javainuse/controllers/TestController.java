package com.javainuse.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Employee;

@RestController
public class TestController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee  firstPage() {
      
		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);
		
		/*Employee emp1 = new Employee();
          emp1.setDesignation("teacher");
          emp1.setEmpId("2");
          emp1.setName("srikumar");
          emp1.setSalary(20000);
        List<Employee> list=new ArrayList<>();
       list.add(emp);
       
        list.add(emp1);
        System.out.println("list adddddddddd"+list);*/
		return emp;
	}
	
	@RequestMapping(value = "/employee1", method = RequestMethod.GET)
	public Employee second() { 
	     Employee emp1 = new Employee();
        emp1.setDesignation("teacher");
        emp1.setEmpId("2");
        emp1.setName("srikumar");
        emp1.setSalary(20000);
		return emp1;
		
	}

}
