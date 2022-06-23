package com.company.employee;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.employee.dto.Employee;
import com.company.employee.dto.EmployeeDetailsDto;

@RestController
public class EmployeeController {
	
	@RequestMapping(value="/employee",method=RequestMethod.GET)
    public Employee firstPage() {
		Employee employee = new Employee();
		employee.setEmpId("1238");
		employee.setName("Alexa");
		employee.setDesignation("Developer");
		employee.setSalary(100000.0);
		return employee;
		
	}

	
//	public List<Employee> getEmployeeDetails(EmployeeDetailsDto details) {
//		switch(details.getFieldName()) {
//		case "technology":
//			//logic to get based on technology
//			break;
//		case "id":
//			//logic to get based on id
//			break;	
//			case "name":
//				//logic to get based on name
//				break;
//		}
//	}
}
