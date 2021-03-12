package com.backOffice.api.properties;


import java.io.IOException;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Order(1)
public class CORSFilter implements Filter {
	private static final Log LOG = LogFactory.getLog(CORSFilter.class);


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        res.addHeader("Access-Control-Allow-Origin", "*");
        if (res.getHeader("Access-Control-Request-Method") != null && "OPTIONS".equals(req.getMethod())) {
            LOG.trace("Sending Header....");
            // CORS "pre-flight" request
            res.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
            // response.addHeader("Access-Control-Allow-Headers", "Authorization");
            res.addHeader("Access-Control-Allow-Headers", "Content-Type");
            res.addHeader("Access-Control-Max-Age", "1");
        }
        chain.doFilter(request, response);
		
	}

}
