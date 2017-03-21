package org.dev.pro.test;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.Before;
import org.dev.pro.model.Student;
public class StudentTest{

@Test
public void testStudentId(){
Student student=new Student(1,"Noah Matovu",4,1);
Assert.assertEquals(1,student.getId());
}

@Test
public void testName(){
Student student=new Student(5,"Leah Nayiga",1,1);
Assert.assertEquals(2,student.getId());
}
}
