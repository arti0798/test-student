package com.student.subjectdetail.service;

import java.util.List;

import javax.annotation.Resource;

import com.student.subjectdetail.dao.SubjectDao;
import com.student.subjectdetail.entity.SubjectEntity;

import org.springframework.stereotype.Component;

/**
 * SubjectServiceImp
 */
@Component
public class SubjectServiceImp implements SubjectService {

  @Resource SubjectDao subjectDao;
  
  @Override
  public List<SubjectEntity> getSubjectDetail() {

    subjectDao.getSubjectDetail();
    System.out.println("subject impl");
    List<SubjectEntity> listOfSubject = subjectDao.getSubjectDetail();
    return listOfSubject;
  }

}