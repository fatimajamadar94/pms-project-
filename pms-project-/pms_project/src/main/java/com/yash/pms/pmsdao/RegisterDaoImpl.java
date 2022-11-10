package com.yash.pms.pmsdao;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.yash.pms.model.EmployeeMaster;

@Repository
public class RegisterDaoImpl  {
	@Autowired
	SessionFactory sessionfactory;
	

//	@Override
//	public EmployeeMaster userLogin(String username, String password) {
//			Session session=sessionfactory.openSession();
//			Criteria criteria=session.createCriteria(EmployeeMaster.class);
//			criteria.add(Restrictions.eq("userName", username));
//			criteria.add(Restrictions.eq("password", password));
//			EmployeeMaster emp =(EmployeeMaster) criteria.uniqueResult();
//			System.out.println(username);
//			System.out.println(password);
//			return emp;
//			
//		}


		/*
		 * @Override public EmployeeMaster save(EmployeeMaster employeeMaster) { Session
		 * session=sessionfactory.openSession(); session.save(employeeMaster); return
		 * null; }
		 */


	

}
