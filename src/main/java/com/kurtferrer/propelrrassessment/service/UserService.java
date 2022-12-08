package com.kurtferrer.propelrrassessment.service;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kurtferrer.propelrrassessment.dao.UserDAO;
import com.kurtferrer.propelrrassessment.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;
	
	public User saveUser(User user) {
		String birthDate = user.getBirthdate();
		int calculatedAge = Period.between(LocalDate.parse(birthDate),LocalDate.now()).getYears();
		user.setAge(calculatedAge);
		return userDAO.save(user);
	}
}
