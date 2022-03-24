package com.tian.service;

import com.tian.Main;
import com.tian.domain.Student;
import com.tian.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;


/**
 * @author ：tianLe
 * @date ：Created in 2022/3/24 1:45 下午
 * @description：
 * @modified By：
 * @version:
 */
@RunWith(value = SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class StudentServiceTest {

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private StudentService studentService;
    @Test
    public void test(){
        studentService.getAllStudents();
    }

    @Test
   public void getAllStudents() {
        Student student = new Student();

        //student.setName("oo");
        student.setAge(17);

//        Example example = new Example(Student.class);
//        Example.Criteria criteria = example.selectProperties("name","age","studentId").createCriteria().andEqualTo("age", 17);
        Example example = new Example(Student.class);
        ArrayList<Object> list = new ArrayList<>();
        list.add(17);
        list.add(18);
        list.add(19);
        //example.createCriteria().andIn("age",list);
        //example.createCriteria().andBetween("age",17,18).andEqualTo("name","tianle");
       // example.createCriteria().andNotEqualTo("age",99);
       // example.createCriteria().andCondition(" age >=1");
       // example.createCriteria().andLike("name","%an%");
       // example.createCriteria().andEqualTo("name","tianle").orIn("age",list);
        //example.createCriteria().andLessThanOrEqualTo("age",99);
        List<Student> students1 = studentMapper.selectByExample(example);
        System.out.println(students1);
//        Student student1 = studentMapper.selectOne(student);
//        System.out.println(student1);
        // int insert = studentMapper.insert(student);
        //  int delete = studentMapper.delete(student);
        //boolean b = studentMapper.existsWithPrimaryKey(2L);
       // int i = studentMapper.deleteByPrimaryKey(1L);
//        Example example = new Example(Student.class);
//        Example.Criteria criteria = example.createCriteria();
//        criteria.
//        studentMapper.selectByExample(example)
//        System.out.println(select);
        System.out.println("=================");
        List<Student> students = studentMapper.selectAll();



        System.out.println(students);

    }
}