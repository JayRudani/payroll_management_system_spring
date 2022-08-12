package com.project.payrollmanagementsystem.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.payrollmanagementsystem.model.Employee;
import com.project.payrollmanagementsystem.model.Login;
import com.project.payrollmanagementsystem.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;
	
	@PersistenceContext
    private EntityManager entityManager;
	
	public ArrayList getLoginData(long login_id) {
		 Query q = entityManager.createQuery("SELECT emp, log from employee emp, login log WHERE employee_id = login_employee_id AND login_id = :login_id");
		 List<Object[]> login = q.setParameter("login_id", login_id).getResultList();
				 ArrayList<HashMap<String, String>> resultArray = new ArrayList();
		 
		
		 for ( Object[] row : login ) {
			  
			 HashMap<String, String> results = new HashMap();
			  Login login_details = (Login)row[ 1 ];
			  Employee employee_details = (Employee)row[ 0 ];
			  
				System.out.print("Employee ID"+login_details.getLogin_employee_id());

			    results.put("login_id",String.valueOf(login_details.getLogin_id()));
				results.put("login_employee_id",login_details.getLogin_employee_id());
				results.put("login_email",login_details.getLogin_email());
				results.put("login_level_id",login_details.getLogin_level_id());
				
			    results.put("employee_id",String.valueOf(employee_details.getEmployee_id()));
				results.put("employee_sal",employee_details.getEmployee_sal());
				results.put("employee_first_name",employee_details.getEmployee_first_name());
				results.put("employee_middle_name",employee_details.getEmployee_middle_name());
				results.put("employee_last_name",employee_details.getEmployee_last_name());
				results.put("employee_gender",employee_details.getEmployee_gender());
				results.put("employee_address",employee_details.getEmployee_address());
				results.put("employee_city",employee_details.getEmployee_city());
				results.put("employee_province",employee_details.getEmployee_province());
				results.put("employee_country",employee_details.getEmployee_country());
//				results.put("employee_landline",employee_details.getEmployee_landline());
				results.put("employee_mobile",employee_details.getEmployee_mobile());
				results.put("employee_email",employee_details.getEmployee_email());
				results.put("employee_status",employee_details.getEmployee_status());
				results.put("employee_deparment",employee_details.getemployee_department());
				results.put("employee_dob",employee_details.getEmployee_dob());
				results.put("employee_nationalty",employee_details.getEmployee_nationalty());
			    resultArray.add(results);
			 
		 }	 
       return resultArray;
	}

	public ArrayList checkLogin(@Valid @RequestBody Login login) {
		Login loginObj = loginRepository.checkLogin(login.getLogin_email(), login.getLogin_password());
		
		return this.getLoginData(loginObj.getLogin_id());
	}
}
