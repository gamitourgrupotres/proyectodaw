package com.dawes.daoImp;

import org.hibernate.SessionFactory;

import com.dawes.dao.ClienteDAO;
import com.dawes.modelo.Cliente;


public class MySqlClienteDAOImpl extends GenericDAOImpl<Cliente, Integer> implements ClienteDAO{

	public MySqlClienteDAOImpl(SessionFactory sf) {
		super(sf);
	}
}
