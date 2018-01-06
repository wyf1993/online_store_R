package org.online.store.util.exception;

import java.util.Date;

/**
 * @author Nico Robin
 * @date 2017年12月23日 - 下午4:50:23
 * @todo 系统内部异常
 **/
public abstract class SystemException extends RuntimeException {

	private static final long serialVersionUID = -1817348504562496684L;

	protected Date time;

	protected Class<?> curClass;

	protected String method;

	protected String displayMessage;

	public SystemException(String message, Class<?> curClass, String method) {
		super(message);
		this.time = new Date();
		this.curClass = curClass;
		this.method = method;
		this.displayMessage = message;
	}

	public SystemException(String message, String displayMessage, Class<?> curClass, String method) {
		super(message);
		this.time = new Date();
		this.curClass = curClass;
		this.method = method;
		this.displayMessage = displayMessage;
	}

	public Date getTime() {
		return time;
	}

	public Class<?> getCurClass() {
		return curClass;
	}

	public String getMethod() {
		return method;
	}

	public String getDisplayMessage() {
		return displayMessage;
	}

}
