package com.wfz.springboot;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.wfz.springboot.dao.DepartmentMapper;
import com.wfz.springboot.pojo.Department;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentTest {
	
	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Test
	public void test(){
		testInsert();
	}
	
	public void testInsert() {
        Department department = new Department();
        department.setId(1);
        department.setName("研发部");
        department.setDescr("开发产品");
        this.departmentMapper.insert(department);
    }
    
    public void testGetById() {
        Department department = this.departmentMapper.getById(1);
        System.out.println(department.getName());
    }
    
    public void testUpdate() {
        Department department = new Department();
        department.setId(1);
        department.setDescr("开发高级产品");
        this.departmentMapper.update(department);
    }
    
    public void testDeleteById() {
        this.departmentMapper.deleteById(1);
    }
    
}
