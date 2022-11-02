package com.yash.pms.pmsdao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.cj.Session;
import com.yash.pms.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	Transaction transaction = null;
	org.hibernate.Session session = null;
	@Autowired
	SessionFactory sessionFactory;
//	@Autowired
//	 ProductRepository repo;
//	
public List<Product> listAll() {
	List<Product>list=new ArrayList<>() ;
	session = sessionFactory.openSession();
	try {
		Query query=session.createSQLQuery("select * from Product");
		list=query.list();
		System.out.println(list);
  	}catch (Exception e) {
		// TODO: handle exception
	}finally {
	session.close();	
	}
	return list;}
	

	@Override
	public Boolean add(Product product) {
		boolean flag = true;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(product);
			transaction.commit();
			return flag;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}

	}


	@Override
	public Product getProduct(Integer id) {
		Product product=new Product();
		session = sessionFactory.openSession();
		try {
		Query query=session.createQuery("from Product where pid=:id ");
		query.setParameter("id", id);
		product=(Product) query.uniqueResult();
		System.out.println(product);
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			session.close();
		}

		return product;
	}


	@Override
	public void deleteId(Integer id) {
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		try {
		Query query=session.createQuery("delete from Product where pid=:id ");
		query.setParameter("id", id);
		query.executeUpdate();
		transaction.commit();
		}
		catch (Exception e) {
e.printStackTrace();		}
	finally {
		session.close();
	}
	}


	@Override
	public Boolean update(Product product) {
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		try {
		session.update(product);
			transaction.commit();
          System.out.println("updated");
		}
			catch (Exception e) {
	e.printStackTrace();		}
		finally {
			session.close();
		}
		return true;	}

}
