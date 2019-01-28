package com.javaweb.funding.manager.service;

import java.util.Map;

import com.javaweb.funding.util.Page;
import com.javaweb.funding.vo.Data;

public interface RoleService {

	Page queryPage(Map<String, Object> paramMap);

	int saveRolePermissionRelationship(Integer roleid, Data datas);

}
