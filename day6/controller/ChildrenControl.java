package com.sibiraj.rest.day6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sibiraj.rest.day6.model.ChildrenModel;
import com.sibiraj.rest.day6.service.ChildrenService;



@RestController
@RequestMapping("/api/v1/user")
public class ChildrenControl{
	@Autowired
	ChildrenService cser;
	@PostMapping("/add")
	public ChildrenModel adddeatils(@RequestBody ChildrenModel s) {
		return cser.addinfo(s);
	}
	@GetMapping("/{name}")
	public List<ChildrenModel> showdetails(@PathVariable String name){
		return cser.show(name);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		cser.deleteinfo(id);
	}
}