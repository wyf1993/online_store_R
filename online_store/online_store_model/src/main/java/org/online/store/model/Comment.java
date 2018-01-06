package org.online.store.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 评论
 * 
 * @author Administrator
 *
 */
@Entity
@Table(name = "COMMENT")
public class Comment extends BaseEntity {

	private static final long serialVersionUID = 4660559172832226740L;

	/**
	 * 评论内容
	 */
	@Column(name = "CONTENT", length = 1024)
	private String content;

	/**
	 * 评论星级
	 */
	@Column(name = "LEVEL")
	private Integer level;

	/**
	 * 评论时间
	 */
	@Column(name = "CREATE_TIME")
	@Temporal(TemporalType.TIME)
	private Date createTime;

	/**
	 * 图片
	 */
	@Column(name = "PICTURE", length = 256)
	private String picture;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

}
