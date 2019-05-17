/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package tsu.hfq.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.*;

import tsu.hfq.ORM.*;
import tsu.hfq.base.*;
import tsu.hfq.service.*;

import tsu.hfq.struts.form.LoginForm;

/** 
 * MyEclipse Struts
 * XDoclet definition:
 * @struts.action path="/Admin/login" name="loginForm" input="/Admin/adminLogin.jsp" parameter="method" scope="request" validate="true"
 * @struts.action-forward name="logoutSuccess" path="/Admin/toLogin.htm"
 * @struts.action-forward name="loginSuccess" path="/Admin/adminIndex.jsp"
 */
public class AdminLoginAction extends BaseAction {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward login(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		LoginForm loginForm = (LoginForm) form;
		AdminService service = new AdminServiceImpl();
		ActionForward forward = null;
		ActionMessages msgs = new ActionMessages();
		try{
			Admin admin = service.adminLogin(loginForm.getLoginName(), loginForm.getLoginPwd());
			if (admin!=null){
				request.getSession().setAttribute("Admin", admin);
				forward = mapping.findForward("loginSuccess");
			}else{				
				forward = mapping.getInputForward();
				msgs.add("loginError",new ActionMessage(Constants.ADMIN_LOGINERROR_KEY));
				saveErrors(request, msgs);
			}
		}catch(Exception ex){
			logger.info("��ִ��AdminLoginAction���е�login����ʱ���??\n");
			ex.printStackTrace();
		}
		return forward;
	}
	
	public ActionForward logout(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {		
		request.getSession().invalidate();
		return mapping.findForward("logoutSuccess");	
	}
}