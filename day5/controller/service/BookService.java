package com.sibiraj.rest.service;

import com.sibiraj.rest.model.BookModel;

public interface BookService {

	public boolean addUser(BookModel bookmodel);
	public boolean updateUser(int id,BookModel bookmodel);
	public boolean deleteUser(int id);

}