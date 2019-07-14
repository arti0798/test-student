package com.student.subjectdetail.dao;

import java.util.List;

import com.student.subjectdetail.entity.SubjectEntity;
import com.student.subjectdetail.mapping.SubjectRowMapper;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * SubjectDaoImp
 */
@Repository
public class SubjectDaoImp implements SubjectDao {

  NamedParameterJdbcTemplate template;

  public SubjectDaoImp(NamedParameterJdbcTemplate template) {

    this.template = template;
  }
  @Override
  public List<SubjectEntity> getSubjectDetail() {

    String sql = "select * from subject";

    List<SubjectEntity> listOfSubject =  template.query(sql, new SubjectRowMapper());

    System.out.println("in dao impl");
    return listOfSubject;
  }
}