package com.student.studentdetail.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;


import com.student.studentdetail.entity.StudentEntity;

import org.springframework.jdbc.core.RowMapper;

/**
 * StudentMapping
 */
public class StudentMapping implements RowMapper<StudentEntity>{

  @Override
  public StudentEntity mapRow(ResultSet rs, int arg) throws SQLException {

    StudentEntity studentEntity = new StudentEntity();

    studentEntity.setName(rs.getString("name"));
    studentEntity.setId(rs.getInt("id"));
    studentEntity.setAddress(rs.getString("address"));
    return studentEntity;
  }
}