package com.javaweb.funding.manager.service;

import java.util.List;
import java.util.Map;

import com.javaweb.funding.bean.Permission;
import com.javaweb.funding.bean.Role;
import com.javaweb.funding.bean.User;
import com.javaweb.funding.util.Page;
import com.javaweb.funding.vo.Data;


public interface UserService {

	User queryUserLogin(Map<String, Object> map);

	//Page queryPage(Integer pageno, Integer pagesize);

	int saveUser(User user);

	Page queryPage(Map<String, Object> paramMap);

	User queryById(Integer id);

	int updateUser(User user);

	int deleteUser(Integer id);

	int deleteBatchUser(Integer[] id);

	List<Role> queryAllRoles();

	List<Integer> queryRoleIds(Integer id);

	int saveUserRoleRelationship(Integer userid, Data data);

	int deleteUserRoleRelationship(Integer userid, Data data);

	List<Permission> queryPermissionByUserid(Integer id);
	
	
}
