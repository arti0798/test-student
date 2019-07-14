package com.student.studentdetail.controller;

 import java.util.List;

import javax.annotation.Resource;

 import com.student.studentdetail.entity.StudentEntity;
import com.student.studentdetail.studentservice.StudentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * StudentController
 */
@RestController
@RequestMapping(path = "/student")
public class StudentController {

  @Resource StudentService studentService;
  @GetMapping(value = "/detail")  
  public List<StudentEntity> getDetail() {

     List<StudentEntity> listOfStudent = studentService.getDetail();
     
     return listOfStudent;
  } 
}