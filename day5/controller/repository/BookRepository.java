package com.sibiraj.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sibiraj.rest.model.BookModel;





public interface BookRepository extends JpaRepository<BookModel,Integer>{



	boolean existsById(int id);



}