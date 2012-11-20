package org.guess.repo.domain;

/**
 * 定义 GAV信息
 * 
 * @author rguess
 * 
 */
public class GAV {

	private String groupId;

	private String artifactId;

	private String version;
	
	private String packaging;

	public GAV() {

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

	

}
