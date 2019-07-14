package com.student.studentdetail.dao;

import java.util.List;

import com.student.studentdetail.entity.StudentEntity;
import com.student.studentdetail.mapping.StudentMapping;

//import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Template;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * StudentDaoImpl
 */@Repository
public class StudentDaoImpl implements StudentDao{

  NamedParameterJdbcTemplate template;

  public StudentDaoImpl(NamedParameterJdbcTemplate template) {
    this.template = template;
  }

  @Override
  public List<StudentEntity> getDetail() {

    String sql = "select * from studentEntity";
     List<StudentEntity> listOfStudent = template.query(sql, new StudentMapping());
    
    return listOfStudent;
  }
}