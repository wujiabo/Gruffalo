package com.wujiabo.opensource.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wujiabo.opensource.realm.UserRealm.ShiroUser;
import com.wujiabo.opensource.web.bind.CurrentUser;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index(@CurrentUser ShiroUser loginUser, Model model) {
		return "index";
	}

	@RequiresPermissions("account:create")
	@RequestMapping("/test/permission")
	public String permission() {
		return "index";
	}

	@RequiresRoles("administrator")
	@RequestMapping("/test/role")
	public String role() {
		return "index";
	}

	@RequestMapping("/test/session")
	public String session(HttpServletRequest request) {
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		session.setAttribute("TEST_CLUSTER", "1");
		request.getSession().setAttribute("TEST_CLUSTER2", "2");
		return "index";
	}
}
