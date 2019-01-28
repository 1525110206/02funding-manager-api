package com.javaweb.funding.manager.service;

import java.util.List;

import com.javaweb.funding.bean.Cert;
import com.javaweb.funding.bean.MemberCert;

public interface CertService {

	List<Cert> queryAllCert();

	List<Cert> queryCertByAccttype(String accttype);

	void saveMemberCert(List<MemberCert> certimgs);

}
