package com.sibiraj.rest.day6.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sibiraj.rest.day6.model.ChildrenModel;
import com.sibiraj.rest.day6.repository.ChildrenRepo;



@Service
public class ChildrenService {
	@Autowired
	ChildrenRepo cr;
	public ChildrenModel addinfo(ChildrenModel s) {
		return cr.save(s);
	}
	public List<ChildrenModel> show(ChildrenModel s){
		return cr.findAll(s);
	}
	public void deleteinfo(int id) {
		cr.deleteById(id);
	}
	public List<ChildrenModel> show(String name) {
		// TODO Auto-generated method stub
		return cr.show(name);
	}
}