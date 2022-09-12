package com.vlasov.first_project.dao;

import com.vlasov.first_project.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getCurrentEmployee(int id);
}
