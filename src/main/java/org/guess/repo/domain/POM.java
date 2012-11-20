package org.guess.repo.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * pom.xml的bean类
 * @author Junv
 *
 */
@XmlRootElement
@Document
public class POM {
	
	private String modelVersion;
	
	private String groupId;
	
	private String artifactId;
	
	private String version;
	
	private String packaging;
	
	private String name;
	
	private String url;
	
	/**
	 * 定义依赖中的组件
	 */
	private List<GAV> dependencies;
	
	

	public String getModelVersion() {
		return modelVersion;
	}

	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
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

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getPackaging() {
		return packaging;
	}

	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<GAV> getDependencies() {
		return dependencies;
	}

	public void setDependencies(List<GAV> dependencies) {
		this.dependencies = dependencies;
	}
	
	

}
