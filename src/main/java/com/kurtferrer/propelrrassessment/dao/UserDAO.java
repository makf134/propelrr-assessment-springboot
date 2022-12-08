package com.kurtferrer.propelrrassessment.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kurtferrer.propelrrassessment.entity.User;

@Repository
public interface UserDAO extends CrudRepository<User,Integer>{

}
