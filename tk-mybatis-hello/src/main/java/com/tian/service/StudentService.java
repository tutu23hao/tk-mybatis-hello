package com.tian.service;

import com.tian.domain.Student;
import com.tian.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：tianLe
 * @date ：Created in 2022/3/24 1:40 下午
 * @description：
 * @modified By：
 * @version:
 */
@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public void getAllStudents(){
        Student student = new Student();
        student.setName("田乐");
        student.setAge(17);

        int insert = studentMapper.insert(student);

        List<Student> students = studentMapper.selectAll();

        System.out.println(student);
    }
}
