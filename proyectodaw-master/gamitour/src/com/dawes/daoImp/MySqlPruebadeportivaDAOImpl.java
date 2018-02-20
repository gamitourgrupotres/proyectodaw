package com.dawes.daoImp;

import org.hibernate.SessionFactory;


import com.dawes.dao.PruebadeportivaDAO;
import com.dawes.modelo.PruebaDeportiva;


public class MySqlPruebadeportivaDAOImpl extends GenericDAOImpl<PruebaDeportiva, Integer> implements PruebadeportivaDAO{

	public MySqlPruebadeportivaDAOImpl(SessionFactory sf) {
		super(sf);
	}
	


}