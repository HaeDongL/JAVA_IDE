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
	
	//==> 회원정보 :: INSERT(회원가입)
	public int addUser(User user) throws Exception {
		return userDao.addUser(user);
	}
	//==> 회원정보 :: SELECT(회원정보 검색)
	public User getUser(String userId) throws Exception {
		return userDao.getUser(userId);
	}
	//==> 회원정보 :: UPDATE(회원정보 변경)
	public int updateUser(User user) throws Exception {
		return userDao.updateUser(user);
	}
	//==> 회원정보 :: DELETE (회원정보 삭제)
	public int removeUser(String userId) throws Exception {
		return userDao.removeUser(userId);
	}
	//==> 회원정보 :: SELECT(회원 정보 검색)
	public List<User> getUserList(Search search) throws Exception {
		return userDao.getUserList(search);
	}
	
	
}
