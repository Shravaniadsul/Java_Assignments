package com.solution.service;

import com.solution.Employee.Employee;
import com.solution.dao.DaoImpl;
import com.solution.dao.IDao;

public class ServiceImpl implements IService {

	@Override
	public Employee select(int Id) {
		IDao dao = new DaoImpl();
		return dao.select(Id);
	}

	@Override
	public Integer insert(Employee emp) {
		IDao dao = new DaoImpl();
		return dao.insert(emp);
	}

	@Override
	public Integer update(Employee emp) {
		IDao dao = new DaoImpl();
		return dao.update(emp);
	}

	
	@Override
	public Integer delete(int Id) {
		 IDao dao = new DaoImpl();
			return dao.delete(Id);
	}

	
}
