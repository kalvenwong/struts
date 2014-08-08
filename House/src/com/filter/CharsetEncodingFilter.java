package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**
 * 采用Filter统一处理字符集
 * @author Ronaldinho
 *
 */
public class CharsetEncodingFilter implements Filter {

    private String endcoding;
    
    public void destroy() {
    }
    
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        //设置web.xml中配置的字符集
        request.setCharacterEncoding(endcoding);
        //继续执行
        chain.doFilter(request, response);
    }
    
    public void init(FilterConfig filterConfig) throws ServletException {
        this.endcoding = filterConfig.getInitParameter("endcoding");
    }

}