package com.springboot.learning.basicrestapis;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.learning.basicrestapis.beans.Details;
import com.springboot.learning.basicrestapis.beans.Employee;

@RestController
public class BasicRestAppController {
		@Autowired
		private CombinerContro combiner;
	
		@RequestMapping("/employees")
		public List<Employee> employeeList(){
			return Arrays.asList(
				new Employee(1,"Mani",60000),	
				new Employee(2,"kanta",70000),
				new Employee(3,"Kalyani",80000),
				new Employee(4,"Bubu",90000),
				new Employee(5, "bubuKaBache", 100000)
					);
		}
		
		@RequestMapping("/employeeDetails")
		public List<Details> details(){
			return Arrays.asList(
				new Details("Hyd","AP","7327826782"),
				new Details("Hyd","TS","27763267328"),
				new Details("Hyd","UK","2732t878237"),
				new Details("Hyd","RP","4773638383"),
				new Details("Hyd","JP","348738993")
					);
		}
		
//		@RequestMapping("/AllDetails")
//		public List<CombinerContro> allDetails(){
//			return Arrays.asList(
//					new CombinerContro(new Employee(1,"Mani",60000),new Details("Hyd","AP","7327826782")),
//					new CombinerContro(null, null)
//					);	
//		}
		@RequestMapping("/AllDetails")
		public List<CombinerContro> returnCombiner(){
			return Arrays.asList(new CombinerContro(employeeList(),details()));
		}
		
}
