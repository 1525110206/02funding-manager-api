package com.javaweb.funding.manager.dao;

import com.javaweb.funding.bean.Permission;
import com.javaweb.funding.bean.Role;
import com.javaweb.funding.bean.User;
import com.javaweb.funding.vo.Data;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

	User queryUserLogin(Map<String, Object> map);

	//List<User> queryList(@Param("startIndex") Integer startIndex, 
			//@Param("pageSize")Integer pageSize);

	

	List<User> queryList(Map<String, Object> paramMap);

	Integer queryCount(Map<String, Object> paramMap);

	List<Role> queryAllRole();

	List<Integer> queryRoleById(Integer id);

	

	int deleteUserRoleRelationship(@Param("userid") Integer userid, @Param("data") Data data);

	int saveUserRoleRelationship(@Param("userid") Integer userid, @Param("data") Data data);

	List<Permission> queryPermissionByUserid(Integer id);
}