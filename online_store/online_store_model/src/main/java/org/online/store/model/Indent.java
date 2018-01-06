package org.online.store.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.online.store.util.sysenum.IndentStatus;

/**
 * 订单
 * 
 * @author Administrator
 */
@Entity
@Table(name = "INDENT")
public class Indent extends BaseEntity {

	private static final long serialVersionUID = 3536732130410379514L;

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

	/**
	 * 下单时间
	 */
	@Column(name = "CREATE_TIME")
	@Temporal(TemporalType.TIME)
	private Date createTime;

	/**
	 * 到货时间
	 */
	@Column(name = "RECEIVE_TIME")
	@Temporal(TemporalType.TIME)
	private Date receiveTime;

	/**
	 * 收货地址
	 */
	@ManyToOne
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;

	/**
	 * 寄件方式
	 */
	@Column(name = "SEND_WAY", length = 64)
	private String sendWay;

	/**
	 * 订单状态（已发货、待发货。。。）
	 */
	@Column(name = "STATUS")
	@Enumerated(EnumType.STRING)
	private IndentStatus status;

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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getReceiveTime() {
		return receiveTime;
	}

	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getSendWay() {
		return sendWay;
	}

	public void setSendWay(String sendWay) {
		this.sendWay = sendWay;
	}

	public IndentStatus getStatus() {
		return status;
	}

	public void setStatus(IndentStatus status) {
		this.status = status;
	}

}
