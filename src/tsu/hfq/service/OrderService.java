package tsu.hfq.service;

import tsu.hfq.ORM.*;

import java.util.*;

public interface OrderService {
	/** �������� */	
	public boolean addOrder(Orders order) throws Exception;
	/** ���ĳ��Ա�����ж���? */
	public List browseOrder(Member member) throws Exception;
	/** ������ж���? */
	public List browseOrder() throws Exception;
	/** ���ĳ������������Ʒ���? */
	public List browseOrderMer(Cart cart) throws Exception;			
	/** ɾ�� */	
	public boolean delOrder(Integer id) throws Exception;	
	/** װ�ض��� */	
	public Orders loadOrder(Integer id) throws Exception;
	/** �޸Ķ��� */	
	public boolean updateOrder(Orders order) throws Exception;
}
