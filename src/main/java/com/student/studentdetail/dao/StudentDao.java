package com.student.studentdetail.dao;

import java.util.List;

import com.student.studentdetail.entity.StudentEntity;

/**
 * StudentDao
 */
public interface StudentDao {

  public List<StudentEntity> getDetail();
}