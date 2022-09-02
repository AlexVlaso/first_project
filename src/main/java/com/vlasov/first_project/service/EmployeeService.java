package com.vlasov.first_project.service;

import com.vlasov.first_project.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
}
