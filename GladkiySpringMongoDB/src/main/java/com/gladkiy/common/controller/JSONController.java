package com.gladkiy.common.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gladkiy.common.model.Student;

@Controller
@RequestMapping("/students")
public class JSONController {

    private ApplicationContext ctx;

    @RequestMapping(value = "get/{surname}", method = RequestMethod.GET)
    public @ResponseBody
    Student getShopInJSON(@PathVariable String surname) {

	ctx = new GenericXmlApplicationContext(
		"mongo-config.xml");

	MongoOperations mongoOperation = (MongoOperations) ctx
		.getBean("mongoTemplate");

	Student student = mongoOperation.findOne(
		new Query(Criteria.where("surname").is(surname)), Student.class,
		"students");

	return student;
    }

}