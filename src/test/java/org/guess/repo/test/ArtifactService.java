package org.guess.repo.test;

import java.util.List;

import org.guess.repo.dao.ArtifactDao;
import org.guess.repo.domain.Artifact;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public class ArtifactService {

	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	ArtifactDao artifactDao = context.getBean(ArtifactDao.class);
	
	@Test
	public void getListByArtifactId() {
		List<Artifact> list = artifactDao.findListByArtifactid("nimei");
		for(Artifact artifact:list){
			System.out.println(artifact.getRequestPath());
		}
	}
	
	@Test
	public void getListByGroupId(){
		List<Artifact> list = artifactDao.findListByGroupId("org.yun70");
		for(Artifact artifact:list){
			System.out.println(artifact.getRequestPath());
			System.out.println(artifact.getId());
		}
	}
	
	@Test
	public void getArtifactByrequestPath(){
		Artifact artifact = artifactDao.findOneByRequestPath("org/yun70/hello/1.1.0");
		System.out.println(artifact.getUploadPerson());
	}
	
	@Test
	public void getById(){
		Artifact artifact = artifactDao.findOne("50348f7fd789dc1055258d06");
		System.out.println(artifact.getRequestPath());
	}
	
	@Test
	public void getListByGA(){
		List<Artifact> list = artifactDao.findListByGA("org.yun70", "nimei");
		for(Artifact artifact:list){
			System.out.println(artifact.getRequestPath());
			System.out.println(artifact.getId());
		}
	}
	
	@Test
	public void getAll(){
		List<Artifact> list = artifactDao.findAll();
		for(Artifact artifact:list){
			System.out.println(artifact.getRequestPath());
			System.out.println(artifact.getId());
		}
	}
	
	@Test
	public void getAllPage(){
		Page<Artifact> page = artifactDao.findAll(new PageRequest(0,5));
		System.out.println(page.getSize());
		System.out.println(page.getNumber());
		System.out.println(page.getTotalElements());
	}
}
