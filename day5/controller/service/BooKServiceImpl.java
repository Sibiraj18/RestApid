package com.sibiraj.rest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sibiraj.rest.model.BookModel;
import com.sibiraj.rest.repository.BookRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BooKServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public boolean addUser(BookModel bookmodel) {
		boolean userExists = bookRepository.existsById(bookmodel.getId());
		if(!userExists) {
			bookRepository.save(bookmodel);
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean updateUser(int id, BookModel bookmodel) {
		//userRepository.saveAndFlush(user);
		Optional<BookModel> existingUserOptional=bookRepository.findById(id);
		if(existingUserOptional.isPresent()){
		BookModel userExists = existingUserOptional.get();
		userExists.setBookName(bookmodel.getBookName());
		userExists.setPrice(bookmodel.getPrice());
		userExists.setQuantity(bookmodel.getQuantity());
		userExists.setAuthorName(bookmodel.getAuthorName());
		bookRepository.save(userExists);
		return true;
	}else {
		return false;
		}
	}

	@Override
	public boolean deleteUser(int id) {
		Optional<BookModel>existingUserOptional = bookRepository.findById(id);
		if(existingUserOptional.isPresent()) {
			bookRepository.deleteById(id);
			return true;
		}
		else {
			return false;
		}
	}

}