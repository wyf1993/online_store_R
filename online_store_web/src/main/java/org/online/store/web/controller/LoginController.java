package org.online.store.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Nico Robin
 * @date 2017��12��23�� - ����11:07:14
 * @todo ��¼ Controller
 **/
@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping("/login")
	public String entry() {
		return "lo_gin";
	}
}
