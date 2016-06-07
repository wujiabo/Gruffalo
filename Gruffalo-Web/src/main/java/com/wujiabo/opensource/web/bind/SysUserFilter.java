package com.wujiabo.opensource.web.bind;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.PathMatchingFilter;

import com.wujiabo.opensource.constants.Constants;
import com.wujiabo.opensource.realm.UserRealm.ShiroUser;

public class SysUserFilter extends PathMatchingFilter {

	@Override
	protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue)
			throws Exception {
		ShiroUser shiroUser = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
		request.setAttribute(Constants.CURRENT_USER, shiroUser);
		request.setAttribute(Constants.CONTEXT_PATH, ((HttpServletRequest)request).getContextPath());
		return true;
	}
}
