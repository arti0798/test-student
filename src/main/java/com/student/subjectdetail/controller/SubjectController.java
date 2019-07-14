package com.student.subjectdetail.controller;

import java.util.List;

import javax.annotation.Resource;

import com.student.subjectdetail.entity.SubjectEntity;
import com.student.subjectdetail.service.SubjectService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SubjectController
 */
@RestController
@RequestMapping(path = "/subject")
public class SubjectController {
  
  @Resource SubjectService subjectService; 
  @GetMapping(value = "/sub")
  public List<SubjectEntity> subject() {

    List<SubjectEntity> listOfSubject = subjectService.getSubjectDetail();
    return listOfSubject;
  }

}