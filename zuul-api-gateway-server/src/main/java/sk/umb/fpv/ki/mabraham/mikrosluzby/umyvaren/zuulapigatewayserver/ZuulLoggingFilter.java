package sk.umb.fpv.ki.mabraham.mikrosluzby.umyvaren.zuulapigatewayserver;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulLoggingFilter extends ZuulFilter {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// ci sa ma filter vykonat
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {

		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();

		logger.info("request -> {} request.uri -> {}", request, request.getRequestURI());

		return null;
	}

	// typ filtra - pred requestom: pre, po requeste: post, pri chybe: error
	@Override
	public String filterType() {
		return "pre";
	}

	// priorita filtra, ak ich je viac
	@Override
	public int filterOrder() {
		return 1;
	}


}
