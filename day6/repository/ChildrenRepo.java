package com.sibiraj.rest.day6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sibiraj.rest.day6.model.ChildrenModel;



@Repository
public interface ChildrenRepo extends JpaRepository<ChildrenRepo, Integer>{

	List<ChildrenModel> getbypage(int pageno, int pagesize);
	List<ChildrenRepo> findAll();
	ChildrenModel save(ChildrenModel s);
	List<ChildrenModel> show(String name);
	List<ChildrenModel> findAll(ChildrenModel s);

}