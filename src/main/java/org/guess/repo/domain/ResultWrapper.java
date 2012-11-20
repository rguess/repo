package org.guess.repo.domain;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 后台返回结果的包装类
 * 
 * @author Junv
 * 
 */
@XmlRootElement
@Document
public class ResultWrapper {

	/**
	 * 成功
	 */
	public static final String SUCCESS_STATUS = "success";

	/**
	 * 错误
	 */
	public static final String ERROR_STATUS = "error";

	/**
	 * 其他类型的状态
	 */
	public static final String OTHER_STATUS = "other";

	private String status;

	private String description;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
