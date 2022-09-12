package com.vlasov.first_project.controller;


import com.vlasov.first_project.entity.Employee;
import com.vlasov.first_project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String getAllEmployees(Model model){
        List<Employee> employees= employeeService.getAllEmployees();
        model.addAttribute("allEmps",employees);
        return "all-employees-view";
    }
    @RequestMapping("/addNewEmployee")
    public String addEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "add-new-employee-view";
    }
    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee")Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }
    @RequestMapping("/updateEmployee")
    public String updateEmployee(@RequestParam("empId") int id,Model model){
        Employee employee = employeeService.getCurrentEmployee(id);
        model.addAttribute("employee",employee);
        return "add-new-employee-view";
    }

}
