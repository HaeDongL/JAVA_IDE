package mybatis.service.service.user.Impl;

import java.util.List;

import mybatis.service.domain.User;
import mybatis.service.service.user.Search;
import mybatis.service.service.user.UserService;

public class UserServiceImpl12 implements UserService {
	///Field
	UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		System.out.println("::"+getClass()+".setUserDao Call...");
		this.userDao = userDao;
	}
	
	///Constructor
	public UserServiceImpl12() {
		System.out.println("::"+getClass()+"default constructor Call...");
	}
	
	
	///Method
	
	//==> ȸ������ :: INSERT(ȸ������)
	public int addUser(User user) throws Exception {
		return userDao.addUser(user);
	}
	//==> ȸ������ :: SELECT(ȸ������ �˻�)
	public User getUser(String userId) throws Exception {
		return userDao.getUser(userId);
	}
	//==> ȸ������ :: UPDATE(ȸ������ ����)
	public int updateUser(User user) throws Exception {
		return userDao.updateUser(user);
	}
	//==> ȸ������ :: DELETE (ȸ������ ����)
	public int removeUser(String userId) throws Exception {
		return userDao.removeUser(userId);
	}
	//==> ȸ������ :: SELECT(ȸ�� ���� �˻�)
	public List<User> getUserList(Search search) throws Exception {
		return userDao.getUserList(search);
	}
	
	
}
