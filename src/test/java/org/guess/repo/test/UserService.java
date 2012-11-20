package org.guess.repo.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.guess.repo.dao.ArtifactDao;
import org.guess.repo.dao.UserDao;
import org.guess.repo.domain.Artifact;
import org.guess.repo.domain.User;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public class UserService {
	
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	UserDao userDao = context.getBean(UserDao.class);
	ArtifactDao artifactDao = context.getBean(ArtifactDao.class);
	

//	private UserDao userDao;
//
//	public void setUserDao(UserDao userDao) {
//		this.userDao = userDao;
//	}
	
	public void test(){
		List<User> list = userDao.findAll();
		for(User u:list){
			System.out.println(u.getUsername());
		}
	}
	
	public void testArtifact(){
//		System.out.println(artifactDao.findOne("50348e9cd789456ef653b615").getRequestPath());
		Page<Artifact> page = artifactDao.findAll(new PageRequest(0, 5));
		System.out.println(page.getNumber());
		System.out.println(page.getNumberOfElements());
		List<Artifact> list = new ArrayList<Artifact>();
		for(Iterator<Artifact> iterator = page.iterator();iterator.hasNext();){
			list.add(iterator.next());
		}
		//List<Artifact> list = artifactDao.findAll();
		for(Artifact artifact:list){
			System.out.println(artifact.getRequestPath());
		}
		System.out.println("条数:"+artifactDao.count());
	}
	
	public void saveUser(){
		User user = new User();
		user.setUsername("hello");
		user.setPassword("hello");
		user.setEmail("502876941@qq.com");
		userDao.save(user);
	}
	
	@Test
	public void getUserByUsername(){
		User user = userDao.findByUsername("rguess");
		System.out.println(user.getPassword());
	}
	
	public static void main(String[] args) {
		UserService userService = new UserService();
		userService.getUserByUsername();
//		userService.test();
//		new UserService().testArtifact();
//		userService.saveUser();
		
	}
	
}
