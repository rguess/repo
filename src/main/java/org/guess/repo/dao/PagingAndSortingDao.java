package org.guess.repo.dao;

import java.io.Serializable;
/**
 * 
 * @author rguess
 *
 * @param <T>
 * @param <ID>
 */
public interface PagingAndSortingDao<T, ID extends Serializable> extends MongoDao<T, Serializable>{

}
