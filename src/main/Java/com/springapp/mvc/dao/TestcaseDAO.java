package com.springapp.mvc.dao;

import com.springapp.mvc.entity.Testcase;
import org.springframework.stereotype.Repository;

@Repository
public interface TestcaseDAO {
    public int insertTestcase(Testcase testcase);
}
