package com.wupeng.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wupeng.springboot.mapper.StudentMapper;
import com.wupeng.springboot.model.Student;
import com.wupeng.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = StudentService.class,version = "1.0-SNAPSHOT",timeout = 15000)
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
