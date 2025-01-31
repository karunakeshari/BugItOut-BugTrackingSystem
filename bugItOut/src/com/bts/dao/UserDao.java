/**
 * 
 */
package com.bts.dao;

import java.util.Set;

import com.bts.beans.User;
import com.bts.exceptions.AuthenticationException;
import com.bts.exceptions.DataAccessException;
import com.bts.exceptions.UserNotFoundException;

/**
 * 
 */
public interface UserDao {
	void createUser(User user) throws DataAccessException;
	User getUserById(int userId) throws UserNotFoundException,DataAccessException;
	User getUserByEmail(String email) throws UserNotFoundException ,DataAccessException;
	User loginUser(String email,String password) throws AuthenticationException,DataAccessException;
	void logoutUser(int userId) throws DataAccessException;
	void updateUserPassword(int userId,String newPassword) throws DataAccessException;
	Set<User> getAllUsers() throws DataAccessException;

}
