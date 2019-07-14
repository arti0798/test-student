package com.student.studentdetail.studentservice;

import java.util.List;

import javax.annotation.Resource;

import com.student.studentdetail.dao.StudentDao;
import com.student.studentdetail.entity.StudentEntity;

import org.springframework.stereotype.Component;

/**
 * StudentServiceImpl
 */
@Component
public class StudentServiceImpl implements StudentService{

  @Resource StudentDao studentDao;

  @Override
  public List<StudentEntity> getDetail() {

   
   List<StudentEntity> listOfStudent = studentDao.getDetail();

   return listOfStudent;

  }


}