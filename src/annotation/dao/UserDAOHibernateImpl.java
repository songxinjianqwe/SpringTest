package annotation.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAOHibernateImpl implements UserDAO{

	@Override
	public void save() {
		System.out.println("UserDAOHibernateImpl save....");
	}
}
