package com.scb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.scb.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student , Integer>{
	
	@Query("select s from Student s where s.stream =:stream")
	public List<Student> findByStream(@Param("stream")  String stream);

}
