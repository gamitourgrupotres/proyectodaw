package com.dawes.daoImp;

import org.hibernate.SessionFactory;

import com.dawes.dao.MultimediaDAO;
import com.dawes.modelo.Multimedia;

public class MySqlMultimediaDAOImp extends GenericDAOImpl<Multimedia, Integer> implements MultimediaDAO{

	public MySqlMultimediaDAOImp(SessionFactory sf) {
		super(sf);
	}
}
