package com.yash.spring.mvc.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.yash.spring.mvc.dao.UserDao;
import com.yash.spring.mvc.dto.User;

@Repository
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	EntityManager entityManager;

	public Integer addUser(User user) {
		System.out.println("user dao called");
		entityManager.persist(user);
		return user.getUserId();
	}

	@Override
	public User validateUser(String userName, String password) {
		List<User> users = (List<User>) entityManager
				.createQuery("from user where firstName:'" + userName + "' password:'" + password + "'")
				.getResultList();

		return users.size() > 0 ? users.get(0) : null;
	}

	

	
}
