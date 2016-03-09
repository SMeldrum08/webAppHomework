package com.example.j2eeapp.dao;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.util.Assert;

import com.example.j2eeapp.commons.dao.GenericJpaDao;
import com.example.j2eeapp.domain.StudentEntity;

public class StudentJpaDao extends GenericJpaDao<StudentEntity, Long> implements StudentDao {

	public StudentJpaDao() {
		super(StudentEntity.class);
	}

	
	public boolean checkAvailable(String studentName) {
		Assert.notNull(studentName);
		
		Query query = getEntityManager().
				createQuery("select count(*) from " + getPersistentClass().getSimpleName()
						+ " u where u.userName = :userName").setParameter("userName",studentName);
		Long count = (Long) query.getSingleResult();
		
		
		return count < 1;
	}

	public StudentEntity loadUserByUsername(String userName) {
		
		Assert.notNull(userName);
		
		StudentEntity user = null;
		
		Query query = getEntityManager().createQuery("select u from " + getPersistentClass().getSimpleName()
				+ " u where u.userName = :userName").setParameter("userName", userName);
		
		try{
			user = (StudentEntity) query.getSingleResult();
		} catch(NoResultException e){
			//Do nothing
		}
		
		return user;
	}
	
	

}
