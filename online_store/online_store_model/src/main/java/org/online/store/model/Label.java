package org.online.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 商品标签（分类）
 * 
 * @author Administrator
 *
 */
@Entity
@Table(name = "LABEL")
public class Label extends BaseEntity {

	private static final long serialVersionUID = -5542285240978676945L;

	/**
	 * 标签名
	 */
	@Column(name = "NAME", length = 16)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
