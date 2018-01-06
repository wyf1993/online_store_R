package org.online.store.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.online.store.util.sysenum.CommodityStatus;

/**
 * 商品
 * 
 * @author Administrator
 *
 */
@Entity
@Table(name = "COMMODITY")
public class Commodity extends BaseEntity {

	private static final long serialVersionUID = -6384018624238590468L;

	/**
	 * 在首页显示的信息
	 */
	@Column(name = "NAME", length = 64)
	private String name;

	/**
	 * 价格
	 */
	@Column(name = "PRICE")
	private Double price;

	/**
	 * 折扣（0-1）默认为1
	 */
	@Column(name = "DISCOUNT")
	private double discount;

	/**
	 * 库存
	 */
	@Column(name = "INVERTORY")
	private Integer inventory;

	/**
	 * 详情页上的标题
	 */
	@Column(name = "TITLE", length = 256)
	private String title;

	/**
	 * 详情页上的广告语
	 */
	@Column(name = "ADVERTISMENT", length = 1024)
	private String advertisment;

	/**
	 * 销量
	 */
	@Column(name = "SALES_VOLUME")
	private Integer salesVolume;

	/**
	 * 状态：上下架
	 */
	@Column(name = "STATUS")
	@Enumerated(value = EnumType.STRING)
	private CommodityStatus status;

	/**
	 * 是否在首页显示内容
	 */
	@Column(name = "DISPLAY_FIRST")
	private Boolean display_first;

	/**
	 * 是否在首页显示广告
	 */
	@Column(name = "DISPLAY_ADVERTISMENT")
	private Boolean display_advertisment;

	/**
	 * 商品信息
	 */
	@OneToOne
	@JoinColumn(name = "INFORMATION_ID")
	private Information information;

	/**
	 * 所属商铺
	 */
	@ManyToOne
	@JoinColumn(name = "STORE_ID")
	private Store store;

	/**
	 * 商品图片
	 */
	@OneToOne
	@JoinColumn(name = "IMAGE_ID")
	private Image image;

	/**
	 * 评论
	 */
	@OneToMany
	@JoinColumn(name = "COMMODITY_ID")
	private Set<Comment> comments;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Integer getInventory() {
		return inventory;
	}

	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAdvertisment() {
		return advertisment;
	}

	public void setAdvertisment(String advertisment) {
		this.advertisment = advertisment;
	}

	public Integer getSalesVolume() {
		return salesVolume;
	}

	public void setSalesVolume(Integer salesVolume) {
		this.salesVolume = salesVolume;
	}

	public CommodityStatus getStatus() {
		return status;
	}

	public void setStatus(CommodityStatus status) {
		this.status = status;
	}

	public Boolean getDisplay_first() {
		return display_first;
	}

	public void setDisplay_first(Boolean display_first) {
		this.display_first = display_first;
	}

	public Boolean getDisplay_advertisment() {
		return display_advertisment;
	}

	public void setDisplay_advertisment(Boolean display_advertisment) {
		this.display_advertisment = display_advertisment;
	}

	public Information getInformation() {
		return information;
	}

	public void setInformation(Information information) {
		this.information = information;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

}
