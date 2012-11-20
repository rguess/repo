package org.guess.repo.domain;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 定义maven仓库的bean
 * @author rguess
 *
 */
@Document
@XmlRootElement
public class MavenRepository {
	
	@Id
	private String id;
	
	private String repositoryName;
	
	/**
	 * 定义仓库类型是否开放等
	 */
	private String repositoryType;
	
	/**
	 * 定义仓库策略，主要有 snapshots，和release两种
	 */
	private String repositoryPolicy;
	
	private String description;
	
	/**
	 * 仓库的地址
	 */
	private String url;
	
	/**
	 * 设置仓库的部署策略
	 */
	private String DeploymentPolicy;
	
	public String getDeploymentPolicy() {
		return DeploymentPolicy;
	}

	public void setDeploymentPolicy(String deploymentPolicy) {
		DeploymentPolicy = deploymentPolicy;
	}

	/**
	 * 快照SNAPHSOT版本仓库
	 */
	public static final String  MAVEN_REPO_POLICY_SNAPSHOT="SNAPSHOT";
	
	/**
	 * 稳定release版本仓库
	 */
	public static final String MAVEN_REPO_POLICY_RELEASE="RELEASE";
	
	/**
	 * maven仓库类型：私有仓库，公众不能访问
	 */
	public static final String MAVEN_REPO_TYPE_PRIVATE = "PRIVATE";
	
	/**
	 * maven仓库类型：公众可以访问
	 */
	public static final String MAVEN_REPO_TYPE_PUBLIC="PUBLIC";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRepositoryName() {
		return repositoryName;
	}

	public void setRepositoryName(String repositoryName) {
		this.repositoryName = repositoryName;
	}

	public String getRepositoryType() {
		return repositoryType;
	}

	public void setRepositoryType(String repositoryType) {
		this.repositoryType = repositoryType;
	}

	public String getRepositoryPolicy() {
		return repositoryPolicy;
	}

	public void setRepositoryPolicy(String repositoryPolicy) {
		this.repositoryPolicy = repositoryPolicy;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
