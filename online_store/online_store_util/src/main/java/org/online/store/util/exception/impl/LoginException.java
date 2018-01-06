package org.online.store.util.exception.impl;

import org.online.store.util.exception.SystemException;

/**
 * @author Nico Robin
 * @date 2017��12��23�� - ����10:35:57
 * @todo ��¼�쳣
 **/
public class LoginException extends SystemException {

	private static final long serialVersionUID = 3995418582599056610L;

	public LoginException(String message, Class<?> curClass, String method) {
		super(message, curClass, method);
	}

	public LoginException(String message, String displayMessage, Class<?> curClass, String method) {
		super(message, displayMessage, curClass, method);
	}

}
