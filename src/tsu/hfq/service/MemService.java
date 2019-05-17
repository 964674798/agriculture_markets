package tsu.hfq.service;

import java.util.*;

import tsu.hfq.ORM.*;

public interface MemService {
	/** ��Ա��¼ */
	public Member memLogin(String loginName,String loginPwd) throws Exception;	
	/** �����Ա����? */
	public List browseMemberLevel() throws Exception;
	/** װ�ػ�Ա���� */
	public Memberlevel loadMemberLevel(Integer id) throws Exception;
	/** ����¼�ʺ��Ƿ���Ч */	
	public boolean chkLoginName(String loginName) throws Exception;	
	/** ����ע����? */	
	public boolean addMember(Member member) throws Exception;
	/** �޸�ע����? */	
	public boolean updateMember(Member member) throws Exception;
	
	/** ���ע���Ա*/
	public List browseMember() throws Exception;
	/** ɾ��ע����? */	
	public boolean delMember(Integer id) throws Exception;
	/**װ��ע����? */	
	public Member loadMember(Integer id) throws Exception;	
}
