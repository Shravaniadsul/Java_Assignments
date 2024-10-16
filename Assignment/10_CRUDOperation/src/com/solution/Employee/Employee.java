package com.solution.Employee;

public class Employee {
	private Integer Id;
	private String Name;
	private Integer Age;
	private String City;

public Employee() {
	
}

public Integer getId() {
	return Id;
}

public void setId(Integer id) {
	this.Id = id;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	this.Name = name;
}

public Integer getAge() {
	return Age;
}

public void setAge(Integer age) {
	this.Age = age;
}

public String getCity() {
	return City;
}

public void setCity(String city) {
	this.City = city;
}

@Override
public String toString() {
	return "Employee [Id=" + Id + ", Name=" + Name + ", Age=" + Age + ", City=" + City + "]";
}


}
