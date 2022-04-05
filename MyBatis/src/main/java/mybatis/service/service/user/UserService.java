package mybatis.service.service.user;


import java.util.List;

import mybatis.service.domain.Search;
import mybatis.service.domain.User;

/*
	 * FileName : UserService.java
	 * ȸ������ ���� �����Ͻ� ������ �߻�ȭ�� interface
	 * component: interface �� Encatsulation �� ���밡�� �� lib
	 */

public interface UserService {
	//==> ȸ������ :: INSERT(ȸ������)
	public int addUser(User user) throws Exception;
	
	//==> ȸ������ :: SELECT(ȸ������ �˻�)
	public User getUser(String userId) throws Exception;
	
	//==> ȸ������ :: UPDATE(ȸ������ ����)
	public int updateUser(User user) throws Exception;
	
	//==> ȸ������ :: DELETE (ȸ������ ����)
	public int removeUser(String userId) throws Exception;
	
	//==> ȸ������ :: SELECT(ȸ�� ���� �˻�)
	public List<User> getUserList(Search search) throws Exception;
}
