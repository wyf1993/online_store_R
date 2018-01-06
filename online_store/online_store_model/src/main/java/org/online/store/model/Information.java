package org.online.store.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 商品信息
 * 
 * @author Administrator
 *
 */
@Entity
@Table(name = "INFORMATION")
public class Information extends BaseEntity {

	private static final long serialVersionUID = -2251697869953849105L;

	/**
	 * 商品名
	 */
	@Column(name = "NAME", length = 16)
	private String name;

	/**
	 * 商品编号
	 */
	@Column(name = "NUMBER", length = 32)
	private String number;

	/**
	 * 规格
	 */
	@Column(name = "SIZE", length = 64)
	private String size;

	/**
	 * 产地
	 */
	@Column(name = "PRODUCING_AREA", length = 128)
	private String producingArea;

	/**
	 * 扩展信息
	 */
	@OneToMany
	@JoinColumn(name = "INFORMATION_ID")
	private Set<ExtensionInformation> extensionInfos;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getProducingArea() {
		return producingArea;
	}

	public void setProducingArea(String producing_area) {
		this.producingArea = producing_area;
	}

	public Set<ExtensionInformation> getExtensionInfos() {
		return extensionInfos;
	}

	public void setExtensionInfos(Set<ExtensionInformation> extensionInfos) {
		this.extensionInfos = extensionInfos;
	}

}
