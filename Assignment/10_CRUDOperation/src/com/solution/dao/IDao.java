package com.solution.dao;

import com.solution.Employee.Employee;

public interface IDao {
	public Employee select(int Id );
	public Integer insert(Employee emp);
	
	public Integer delete(int Id);
	public Integer update(Employee emp);
	
}
