package tsu.hfq.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/** 编码过滤器 */
public class CharacterEncodingFilter implements Filter {

	String encoding = null;
	FilterConfig filterConfig = null;
	
	/** 初始化 */
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
		this.encoding = filterConfig.getInitParameter("encoding");
	}

	/** 开始过滤 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		if (encoding!=null){
			request.setCharacterEncoding(encoding);
		}
		chain.doFilter(request,response);
	}

	/** 退出 */
	public void destroy() {
		this.encoding = null;
		this.filterConfig = null;
	}

}