package com.sk.helloboot.repository.querydsl.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sk.helloboot.model.QStudent;
import com.sk.helloboot.model.Student;
import com.sk.helloboot.repository.querydsl.StudentRepositoryCustom;

public class StudentRepositoryImpl implements StudentRepositoryCustom {

	@Autowired
	private JPAQueryFactory queryFactory;

	@Override
	public Student queryDslFindById(Long id) {
		QStudent student = QStudent.student;
		JPAQuery<Student> query = queryFactory.selectFrom(student).where(student.id.eq(id)).fetchAll();
		return null;
	}

}
