package org.online.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "IMAGE")
public class Image extends BaseEntity {

	private static final long serialVersionUID = -485760038524264487L;

	/**
	 * 列表页显示的图片
	 */
	@Column(name = "MAIN", length = 256)
	private String main;

	/**
	 * 详情页显示的细节图片(多张图片，中间用;(英文分号)隔开)
	 */
	@Column(name = "DETAIL", length = 4096)
	private String detail;

	/**
	 * 详情页介绍图（大）(多张图片，中间用;(英文分号)隔开)
	 */
	@Column(name = "INTRODUCTION", length = 4096)
	private String introduction;

	/**
	 * 首页滚屏图片
	 */
	@Column(name = "ADVERTISMENT", length = 256)
	private String advertisment;

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getAdvertisment() {
		return advertisment;
	}

	public void setAdvertisment(String advertisment) {
		this.advertisment = advertisment;
	}

}
