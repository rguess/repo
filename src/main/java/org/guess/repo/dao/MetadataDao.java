package org.guess.repo.dao;

import org.guess.repo.domain.Metadata;
import org.springframework.data.mongodb.repository.Query;

public interface MetadataDao extends MongoDao<Metadata, String>{

	public Metadata findOneByRequestPath(String requestPath);
	
	@Query("{groupId:?0,artifactId:?1}")
	public Metadata findOneByGA(String groupId,String ArtifactId);
}
