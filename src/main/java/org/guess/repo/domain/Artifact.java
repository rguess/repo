package org.guess.repo.domain;

import java.util.HashMap;
import java.util.Iterator;

import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * a maven artifact bean
 * 
 * @author rguess
 * 
 */
@Document
@XmlRootElement
public class Artifact {

	@Id
	private String id;
	

	/**
	 * 上传包的GAV信息
	 */
	private GAV gavToSet;

	/**
	 * 定义所有上传的文件列表<br>
	 * HashMap<文件类型,文件ID>
	 */
	private HashMap<String, String> filesToUpload;

	private String uploadPerson;

	private String uploadDate;
	
	/**
	 * 组件是否上传完整的标记
	 */
	private boolean finished;
	
	/**
	 * 该hashmap用于存储仓库的组件,和仓库值
	 * HashMap<值类型,值><br>
	 * 如：HashMap(RepositoryCOnstant.REPO_ID,x24535353435)
	 * 
	 */
	private HashMap<String ,String> repository; 
	
	/**
	 * 请求路径，在maven客户端上传文件的时候需要
	 */
	private String requestPath;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public GAV getGavToSet() {
		return gavToSet;
	}
  
	public void setGavToSet(GAV gavToSet) {
		this.gavToSet = gavToSet;
	}

	public HashMap<String, String> getFilesToUpload() {
		return filesToUpload;
	}

	public void setFilesToUpload(HashMap<String, String> filesToUpload) {
		this.filesToUpload = filesToUpload;
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

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("Person [id=" + id + ", uploadPerson=" + uploadPerson
				+ ", uploadDate=" + uploadDate);
		sb.append(",gav=[groupid=" + gavToSet.getGroupId() + ",artifactId="
				+ gavToSet.getArtifactId() + ",version="
				+ gavToSet.getVersion() + ",packaging=" + gavToSet.getPackaging() + "]");
		
		sb.append(",filesToUpload=[");
		Iterator<String> it =  filesToUpload.keySet().iterator();
		while(it.hasNext()){
			String tempKey = it.next();
			String tempValue = filesToUpload.get(tempKey);
			sb.append(tempKey+"="+tempValue+",");
		}
		sb.append("]]");
		return sb.toString();
	}

	public HashMap<String ,String> getRepository() {
		return repository;
	}

	public void setRepository(HashMap<String ,String> repository) {
		this.repository = repository;
	}

	public String getRequestPath() {
		return requestPath;
	}

	public void setRequestPath(String requestPath) {
		this.requestPath = requestPath;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	
	

}

