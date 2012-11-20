package org.guess.repo.dao;

import java.util.List;

import org.guess.repo.domain.Artifact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
/**
 * 
 * @author rguess
 *
 */
/**
 * 
 * @author rguess
 *
 */
public interface ArtifactDao extends MongoDao<Artifact,String>{
	
	@Query("{gavToSet.artifactId:?0}")
	public Page<Artifact> findListByArtifactid(String artifactId,Pageable pageable);
	
	@Query("{gavToSet.artifactId:?0}")
	public List<Artifact> findListByArtifactid(String artifactId);
	
	@Query("{gavToSet.groupId:?0}")
	public Page<Artifact> findListByGroupId(String groupId,Pageable pageable);
	
	@Query("{gavToSet.groupId:?0}")
	public List<Artifact> findListByGroupId(String groupId);
	
	public Artifact findOneByRequestPath(String requestPath);
	
	@Query("{gavToSet.groupId:?0,gavToSet.artifactId:?1}")
	public Page<Artifact> findListByGA(String groupId,String artifactId,Pageable pageable);
	
	@Query("{gavToSet.groupId:?0,gavToSet.artifactId:?1}")
	public List<Artifact> findListByGA(String groupId,String artifactId);
	

}
