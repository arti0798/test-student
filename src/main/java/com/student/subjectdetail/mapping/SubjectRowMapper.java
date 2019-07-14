package com.student.subjectdetail.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.student.subjectdetail.entity.SubjectEntity;

import org.springframework.jdbc.core.RowMapper;

/**
 * SubjectRowMapper
 */
public class SubjectRowMapper implements RowMapper<SubjectEntity> {

  @Override
  public SubjectEntity mapRow(ResultSet rs,int arg) throws SQLException {

    SubjectEntity subEntity = new SubjectEntity();
    subEntity.setSubjectId(rs.getString("subjectId"));
    subEntity.setSubject(rs.getString("subjectname"));
    return subEntity;
  }
}