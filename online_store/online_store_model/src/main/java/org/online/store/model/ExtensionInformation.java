package org.online.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "EXTENSION_INFORMATION")
public class ExtensionInformation extends BaseEntity {

	private static final long serialVersionUID = -4262391452542745314L;

	/**
	 * 扩展信息名
	 */
	@Column(name = "NAME", length = 32)
	private String name;

	/**
	 * 扩展信息值
	 */
	@Column(name = "VALUE", length = 128)
	private String value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
