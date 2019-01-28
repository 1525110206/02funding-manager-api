package com.javaweb.funding.manager.dao;

import com.javaweb.funding.bean.Role;
import com.javaweb.funding.bean.RolePermission;
import com.javaweb.funding.bean.User;

import java.util.List;
import java.util.Map;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    Role selectByPrimaryKey(Integer id);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);

	List<User> queryList(Map<String, Object> paramMap);

	Integer queryCount(Map<String, Object> paramMap);

	int insertRolePermission(RolePermission rp);

	void deleteRolePermissionRelationship(Integer roleid);
}