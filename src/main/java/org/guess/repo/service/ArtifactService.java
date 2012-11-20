package org.guess.repo.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.guess.repo.dao.ArtifactDao;
import org.guess.repo.domain.Artifact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@Path("/artifact")
public class ArtifactService {

	private ArtifactDao artifactDao;

	public void setArtifactDao(ArtifactDao artifactDao) {
		this.artifactDao = artifactDao;
	}
	
	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Artifact> getAll(){
		
		return artifactDao.findAll();
	}
	
	@GET
	@Path("/getAllForPage")
	@Produces(MediaType.APPLICATION_JSON)
	public Page<Artifact> getpage(){
		return artifactDao.findAll(new PageRequest(0, 2));
	}
	
	@GET
	@Path("/getByGA")
	@Produces(MediaType.APPLICATION_JSON)
	public Page<Artifact> getPageByGA(){
		return artifactDao.findListByGA("org.yun70","nimei",new PageRequest(0, 2));
	}
	
}
