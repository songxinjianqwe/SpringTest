package annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import annotation.TestObject;
import annotation.dao.UserDAO;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	@Qualifier("UserDAOImpl")
	private UserDAO dao;
	
	
	public void setDao(UserDAO dao) {
		this.dao = dao;
	}
	
	@Autowired(required=false)
	private TestObject to;
	
	@Override
	public void add() {
		System.out.println("UserService add......");
		dao.save();
		System.out.println(to);
	}
}
