package org.online.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 购物车
 * 
 * @author Administrator
 *
 */
@Entity
@Table(name = "SHOPPING_CART")
public class ShoppingCart extends BaseEntity {

	private static final long serialVersionUID = 8233524020957653655L;

	/**
	 * 商品
	 */
	@ManyToOne
	@JoinColumn(name = "COMMODITY_ID")
	private Commodity commodity;

	/**
	 * 数量
	 */
	@Column(name = "COUNT")
	private Integer count;

	public Commodity getCommodity() {
		return commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}
