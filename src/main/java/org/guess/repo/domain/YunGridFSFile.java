package org.guess.repo.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.gridfs.GridFSDBFile;

/**
 * 用于存储系统文件的bean
 * @author Junv
 *
 */
@Document
@XmlRootElement
public class YunGridFSFile {
	
	@Id
	private String id;
	
	private Long length;

	private String fileName;
	
	private String MD5;
	
	private String contentType;
	
	private Date uploadDate;
	
	private GridFSDBFile gridFSFile;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getLength() {
		return length;
	}

	public void setLength(Long length) {
		this.length = length;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getMD5() {
		return MD5;
	}

	public void setMD5(String mD5) {
		this.MD5 = mD5;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public GridFSDBFile getGridFSFile() {
		return gridFSFile;
	}

	public void setGridFSFile(GridFSDBFile gridFSFile) {
		this.gridFSFile = gridFSFile;
	}

	

}
