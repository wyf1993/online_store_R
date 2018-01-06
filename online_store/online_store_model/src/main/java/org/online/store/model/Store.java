package org.online.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 商铺
 * 
 * @author Administrator
 *
 */
@Entity
@Table(name = "STORE")
public class Store extends BaseEntity {

	private static final long serialVersionUID = 7618296509774062693L;

	/**
	 * 商铺名
	 */
	@Column(name = "NAME", length = 16)
	private String name;

	/**
	 * 信誉度（0-100），分为5个星级，初始为4星。
	 */
	@Column(name = "REPUTATION")
	private Double reputation;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getReputation() {
		return reputation;
	}

	public void setReputation(Double reputation) {
		this.reputation = reputation;
	}

}
