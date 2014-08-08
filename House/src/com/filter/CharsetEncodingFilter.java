package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**
 * ����Filterͳһ�����ַ���
 * @author Ronaldinho
 *
 */
public class CharsetEncodingFilter implements Filter {

    private String endcoding;
    
    public void destroy() {
    }
    
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        //����web.xml�����õ��ַ���
        request.setCharacterEncoding(endcoding);
        //����ִ��
        chain.doFilter(request, response);
    }
    
    public void init(FilterConfig filterConfig) throws ServletException {
        this.endcoding = filterConfig.getInitParameter("endcoding");
    }

}