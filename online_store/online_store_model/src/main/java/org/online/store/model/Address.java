package org.online.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 收货地址
 * 
 * @author Administrator
 *
 */
@Entity
@Table(name = "ADDRESS")
public class Address extends BaseEntity {

	private static final long serialVersionUID = -8196232339457204306L;

	/**
	 * 收货地址
	 */
	@Column(name = "ADDRESS", length = 512)
	private String address;

	/**
	 * 收货联系电话
	 */
	@Column(name = "PHONE_NUMBER", length = 16)
	private String phoneNumber;

	/**
	 * 收货人
	 */
	@Column(name = "RECEIVE", length = 12)
	private String receive;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getReceive() {
		return receive;
	}

	public void setReceive(String receive) {
		this.receive = receive;
	}

}
