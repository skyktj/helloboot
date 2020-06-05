package com.sk.helloboot.repository.querydsl;

import com.sk.helloboot.model.Student;

public interface StudentRepositoryCustom  {
	Student queryDslFindById(Long id);
}
