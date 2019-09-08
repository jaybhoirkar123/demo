package com.cjc.Serv;

import java.util.List;

import com.cjc.model.Employee;

public interface Service1 {
	
	void addEmployee(Employee emp);
	List<Employee> display();
	Employee editData(int eid);
	List<Employee> updateData(Employee emp);
	List<Employee> deleeData(int eid);

}
