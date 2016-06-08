package com.wujiabo.opensource.web.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequiresPermissions("USER:RETRIEVE")
	@RequestMapping("/user/list")
	public String list() {
		return "/User/list";
	}
}
