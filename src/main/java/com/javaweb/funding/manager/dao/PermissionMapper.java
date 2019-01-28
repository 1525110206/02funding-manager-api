package com.javaweb.funding.manager.dao;

import com.javaweb.funding.bean.Permission;

import java.util.List;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    Permission selectByPrimaryKey(Integer id);

    List<Permission> selectAll();

    int updateByPrimaryKey(Permission record);

	Permission getRootPermission();

	List<Permission> getChildrenPermissionByPid(Integer id);

	List<Integer> queryPermissionByRoleid(Integer roleid);
}