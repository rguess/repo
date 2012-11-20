package org.guess.repo.dao;

import org.guess.repo.domain.User;
/**
 * 
 * @author rguess
 *
 */
public interface UserDao extends MongoDao<User, String>{

	public User findByUsername(String username);

}
