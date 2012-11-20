package org.guess.repo.dao;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 定义所有mongo collection都共同操作
 * 
 * @author rguess
 * @param <T>
 * 
 */
public interface MongoDao<T, ID extends Serializable> extends MongoRepository<T, Serializable>{


}
