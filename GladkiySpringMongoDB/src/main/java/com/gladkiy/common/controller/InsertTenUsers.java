package com.gladkiy.common.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import com.gladkiy.common.model.Student;

public class InsertTenUsers {

    private static ApplicationContext ctx;

    /**
     * @param args
     */
    public static void main(String[] args) {
	ctx = new GenericXmlApplicationContext(
		"mongo-config.xml");

	MongoOperations mongoOperation = (MongoOperations) ctx
		.getBean("mongoTemplate");

	for (int i = 0; i < 10; i++) {
	    Student student = new Student();
	    student.setGroup(Integer.valueOf(i+100).toString());
	    student.setInstitute(Integer.valueOf(i+200).toString());
	    student.setName(Integer.valueOf(i+300).toString());
	    student.setSurname(Integer.valueOf(i).toString());
	    student.setYear(Integer.valueOf(2009).toString());
	    mongoOperation.insert(student, "students");
	}
	

    }

}
