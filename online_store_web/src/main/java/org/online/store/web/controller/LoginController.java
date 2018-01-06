package org.online.store.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Nico Robin
 * @date 2017年12月23日 - 下午11:07:14
 * @todo 登录 Controller
 **/
@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping("/login")
	public String entry() {
		return "lo_gin";
	}
}
