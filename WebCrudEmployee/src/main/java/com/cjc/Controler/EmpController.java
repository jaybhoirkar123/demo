package com.cjc.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.Serv.Service1;
import com.cjc.model.Employee;

@RestController
public class EmpController {
	
	@Autowired
	private Service1 sr;
	
	@PostMapping("/add")
	public String addEmployee(@RequestBody Employee emp)
	{
		System.out.println("hiiiiiiiiiiiiiii");
		sr.addEmployee(emp);
		return " Indian Army";
	}
	@GetMapping("/get")
	public List<Employee> display()
	{
		return sr.display();
	}
	@GetMapping("/getemp/{eid}")
	public Employee editData(@PathVariable int eid)
	{
		return sr.editData(eid);
	}
	@PatchMapping("/update")
    public List<Employee> updateData(@RequestBody Employee emp)
    {
    	return sr.updateData(emp);
    }
	@DeleteMapping("/del")
	public List<Employee> deleteData(@PathVariable int eid)
	{
		return sr.deleeData(eid);
	}
	}
