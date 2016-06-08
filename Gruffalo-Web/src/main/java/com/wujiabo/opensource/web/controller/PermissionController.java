package com.wujiabo.opensource.web.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PermissionController {

	@RequiresPermissions("PERMISSION:RETRIEVE")
	@RequestMapping("/permission/list")
	public String list() {
		return "/Permission/list";
	}
}
