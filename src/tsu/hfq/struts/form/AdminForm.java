/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package tsu.hfq.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

/** 
 * MyEclipse Struts
 * XDoclet definition:
 * @struts.form name="adminForm"
 */
public class AdminForm extends ValidatorForm {
	/*
	 * Generated fields
	 */

	/** adminType property */
	private String adminType;

	/** loginPwd property */
	private String loginPwd;

	/** loginName property */
	private String loginName;

	/** adminName property */
	private String adminName;

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
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the adminType.
	 * @return String
	 */
	public String getAdminType() {
		return adminType;
	}

	/** 
	 * Set the adminType.
	 * @param adminType The adminType to set
	 */
	public void setAdminType(String adminType) {
		this.adminType = adminType;
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

	/** 
	 * Returns the adminName.
	 * @return String
	 */
	public String getAdminName() {
		return adminName;
	}

	/** 
	 * Set the adminName.
	 * @param adminName The adminName to set
	 */
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
}