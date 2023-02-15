package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.EmployeeDao;
import dto.Employee;

public class Test extends GenericServlet
{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=arg0.getParameter("empid");
		int empid=Integer.parseInt(s1);
		String empname=arg0.getParameter("empname");
		String dob=arg0.getParameter("dob");
		String male=arg0.getParameter("gen");
		String country=arg0.getParameter("country");	
		
		
	Employee employee=new Employee();
	employee.setEmpid(empid);
	employee.setEmpname(empname);
	employee.setDob(dob);
	employee.setGender(male);
	employee.setCountry(country);
	
	EmployeeDao employeeDao = new EmployeeDao();
	employeeDao.insert(employee);
	}

}
