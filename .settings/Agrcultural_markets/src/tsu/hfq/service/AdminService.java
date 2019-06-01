package tsu.hfq.service;

import tsu.hfq.ORM.*;

import java.util.*;

/** ϵͳ�û�����ӿ�? */
public interface AdminService {

	/** ϵͳ����Ա��¼ */
	public Admin adminLogin(String loginName,String loginPwd) throws Exception;
	
	/** ��������? */
	public List browseAdmin() throws Exception;	
	/** װ��ָ���Ĺ���Ա */	
	public Admin loadAdmin(Integer id) throws Exception;	
	/** ɾ��ָ���Ĺ���Ա */	
	public boolean delAdmin(Integer id) throws Exception;	
	/** ��������Ա */	
	public boolean addAdmin(Admin admin) throws Exception;	
	/** ���¹���Ա */	
	public boolean updateAdmin(Admin admin) throws Exception;	
}