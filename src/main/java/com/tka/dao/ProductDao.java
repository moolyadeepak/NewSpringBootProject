package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Prouct;

import java.util.List;

import org.hibernate.Criteria;

@Repository
public class ProductDao {
	
	@Autowired
	SessionFactory factory;
	Session session=null;

	public List<Prouct> getgetproductnamebyprice(int price) {
	   
		session=factory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		Criteria createCriteria = session.createCriteria(Prouct.class);
		List<Prouct> list = createCriteria.list();
		
		return list;
		
	}

}
