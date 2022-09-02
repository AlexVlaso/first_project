package com.vlasov.first_project.dao;

import com.vlasov.first_project.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    @Autowired
    private SessionFactory factory;
    @Override
    public List<Employee> getAllEmployees() {
        Session session= factory.getCurrentSession();
        List<Employee> result = session.createQuery("from Employee ", Employee.class).getResultList();
        return result;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session= factory.getCurrentSession();
        session.save(employee);
    }
}
