package com.javaweb.funding.manager.service;

import java.util.List;

import com.javaweb.funding.bean.Permission;

public interface PermissionService {

	Permission getRootPermission();

	List<Permission> getChildrenPermissionByPid(Integer id);

	int savePermission(Permission permission);

	int updatePermission(Permission permission);

	Permission getPermission(Integer id);

	int deletePermission(Integer id);

	List<Integer> queryPermissionByRoleid(Integer roleid);

	List<Permission> queryAllPermission();


}
