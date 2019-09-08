package com.cjc.servimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.Serv.Service1;
import com.cjc.dao.EmpDao;
import com.cjc.model.Employee;

@Service
public class ServImp implements Service1{

	 @Autowired
	 private EmpDao d;
	@Override
	public void addEmployee(Employee emp) {
		d.save(emp);
		
	}
	@Override
	public List<Employee> display() {
		
		return d.findAll();
	}
	@Override
	public Employee editData(int eid) {
		
		return d.findById(eid).get();
	}
	@Override
	public List<Employee> updateData(Employee emp) {
		 d.save(emp);
				return d.findAll();
	}
	@Override
	public List<Employee> deleeData(int eid) {
		d.deleteById(eid);
		return d.findAll();
	}

	
}
