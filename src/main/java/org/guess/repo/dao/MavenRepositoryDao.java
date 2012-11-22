package org.guess.repo.dao;

import org.guess.repo.domain.MavenRepository;

public interface MavenRepositoryDao extends MongoDao<MavenRepository,String>{

	public MavenRepository findOneByRepositoryName(String repositoryName);
}
