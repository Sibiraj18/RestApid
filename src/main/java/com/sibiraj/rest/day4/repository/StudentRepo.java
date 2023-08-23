package com.sibiraj.rest.day4.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sibiraj.rest.day4.model.StudentModel;
@Repository
public interface StudentRepo extends JpaRepository<StudentModel, Integer>{

}