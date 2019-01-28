package com.javaweb.funding.manager.dao;

import com.javaweb.funding.bean.Cert;
import com.javaweb.funding.bean.MemberCert;

import java.util.List;

public interface CertMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cert record);

    Cert selectByPrimaryKey(Integer id);

    List<Cert> selectAll();

    int updateByPrimaryKey(Cert record);

	List<Cert> queryCertByAccttype(String accttype);

	void saveMemberCert(MemberCert memberCert);
}