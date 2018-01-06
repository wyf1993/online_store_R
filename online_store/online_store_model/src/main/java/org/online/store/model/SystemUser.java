package org.online.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 系统用户：系统管理员、商户、、、
 * 
 * @author Administrator
 *
 */
@Entity
@Table(name = "SYSTEM_USER")
public class SystemUser extends BaseEntity {

	private static final long serialVersionUID = -5261436730069092939L;

	/**
	 * 用户名
	 */
	@Column(name = "NAME", length = 32)
	private String name;

	/**
	 * 密码
	 */
	@Column(name = "PASSWORD", length = 64)
	private String password;

	/**
	 * 电话号码
	 */
	@Column(name = "PHONE_NUMBER", length = 16)
	private String phoneNumber;

	/**
	 * 邮箱
	 */
	@Column(name = "EMAIL", length = 32)
	private String email;

	/**
	 * 是否商户
	 */
	@Column(name = "BUSINESSMAN")
	private Boolean businessman;

	/**
	 * 商铺
	 */
	@ManyToOne
	@JoinColumn(name = "STORE_ID")
	private Store store;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getBusinessman() {
		return businessman;
	}

	public void setBusinessman(Boolean businessman) {
		this.businessman = businessman;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

}
