package com.wujiabo.opensource.web.controller;

import javax.validation.Valid;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.wujiabo.opensource.model.User;

@Controller
public class UserController {

	@RequiresPermissions("USER:RETRIEVE")
	@RequestMapping("/user/list")
	public String list() {
		return "/User/list";
	}

	@RequiresPermissions("USER:UPDATE")
	@RequestMapping(value = "/user/toEdit/{id}", method = RequestMethod.GET)
	public String toEdit(@PathVariable("id") Long id, Model model) {
		model.addAttribute("user", new User());
		return "/User/edit";
	}

	@RequestMapping(value = "/user/edit", method = RequestMethod.POST)
	public String edit(@Valid @ModelAttribute("user") User user, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("message", "Successful");
		return "redirect:/user/list";
	}

	@RequiresPermissions("USER:DELETE")
	@RequestMapping(value = "/user/delete/{id}")
	public String detele(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("message", "Successful");
		return "redirect:/user/list";
	}
}
