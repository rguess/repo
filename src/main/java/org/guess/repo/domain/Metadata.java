package org.guess.repo.domain;

import java.util.HashMap;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * maven-matada
 * @author guess
 *
 */

@Document
@XmlRootElement
public class Metadata {
	
	@Id
	private String id;
	/**
	 * 构件的groupId信息
	 */
	private String groupId;
	
	/**
	 * 构件的artifactId信息
	 */
	private String artifactId;
	
	/**
	 * 定义所有上传的文件列表<br>
	 * HashMap<文件类型,文件ID>
	 */
	private HashMap<String, String> filesToUpload;
	
	/**
	 * matada对应文件存储的信息
	 */
	private HashMap<String ,String> repository; 
	
	/**
	 * 请求路径，在maven客户端上传文件的时候需要
	 */
	private String requestPath;
	
	private String uploadPerson;

	private String uploadDate;
	
	public HashMap<String, String> getRepository() {
		return repository;
	}

	public void setRepository(HashMap<String, String> repository) {
		this.repository = repository;
	}

	public String getRequestPath() {
		return requestPath;
	}

	public void setRequestPath(String requestPath) {
		this.requestPath = requestPath;
	}

	public String getUploadPerson() {
		return uploadPerson;
	}

	public void setUploadPerson(String uploadPerson) {
		this.uploadPerson = uploadPerson;
	}

	public String getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getArtifactId() {
		return artifactId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	public HashMap<String, String> getFilesToUpload() {
		return filesToUpload;
	}

	public void setFilesToUpload(HashMap<String, String> filesToUpload) {
		this.filesToUpload = filesToUpload;
	}
	
	

}
