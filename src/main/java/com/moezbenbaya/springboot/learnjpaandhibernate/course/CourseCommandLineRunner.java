package com.moezbenbaya.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.moezbenbaya.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.moezbenbaya.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.moezbenbaya.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
	//@Autowired
	//private CourseJdbcRepository repository;
	
	//@Autowired
	//private CourseJpaRepository repository;
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn AWS jpa" ,"MoezBaya" ));
		repository.save(new Course(2, "Learn Azure jpa" ,"Bayrem" ));
		repository.save(new Course(3, "Learn DevOps jpa" ,"Bayrem" ));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("Bayrem"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println(repository.findByName("Learn Azure jpa"));
		System.out.println(repository.findByName("Learn DevOps jpa"));
		
	}

}
