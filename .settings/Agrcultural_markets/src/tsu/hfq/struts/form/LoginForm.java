/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package tsu.hfq.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.*;

import tsu.hfq.base.Constants;

/** 
 * MyEclipse Struts
 * XDoclet definition:
 * @struts.form name="loginForm"
 */
public class LoginForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** loginPwd property */
	private String loginPwd;

	/** loginName property */
	private String loginName;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		String p = request.getParameter("method");
		if (p!=null && p.equals("logout"))return null;
		ActionErrors errors = new ActionErrors();
		ActionMessages msg = new ActionMessages();
		if(loginName==null||loginName.length()<1){
			msg.add("loginName", new ActionMessage(Constants.ADMIN_LOSTNAME_KEY));
		}else if(loginPwd==null||loginPwd.length()<1){
			msg.add("loginPwd", new ActionMessage(Constants.ADMIN_LOSTPWD_KEY));
		}
		errors.add(msg);
		return errors;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.loginName = null;
		this.loginPwd = null;
	}

	/** 
	 * Returns the loginPwd.
	 * @return String
	 */
	public String getLoginPwd() {
		return loginPwd;
	}

	/** 
	 * Set the loginPwd.
	 * @param loginPwd The loginPwd to set
	 */
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	/** 
	 * Returns the loginName.
	 * @return String
	 */
	public String getLoginName() {
		return loginName;
	}

	/** 
	 * Set the loginName.
	 * @param loginName The loginName to set
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
}