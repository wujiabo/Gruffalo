package com.wujiabo.opensource.web.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoleController {

	@RequiresPermissions("ROLE:RETRIEVE")
	@RequestMapping("/role/list")
	public String list() {
		return "/Role/list";
	}
}
