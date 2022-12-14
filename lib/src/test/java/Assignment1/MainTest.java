/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Assignment1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;

import org.joda.time.DateTime;
import org.junit.Test;

public class MainTest {
	Student student = new Student("Bob", "22543564", "1999-10-02");
	Lecturer lecturer = new Lecturer("Ann", "428494", "1999-09-09");
	Module module = new Module("Software Engineering III", "CT401", lecturer);
	Course course = new Course("CS & IT", "2022-09-02", "2023-05-21");
	
    @Test public void verifyStudentDetails() {
    	//Test Name
        assertEquals("Bob", student.getName());
        //Test Age
        assertNotNull(student.getAge());
        //Test DoB
        assertEquals(DateTime.parse("1999-10-02"), student.getDob());
        //Test ID
        assertNotNull(student.getId());
        //Test Username
        assertNotNull(student.getUsername());
        //Test Modules
        student.addModule(module);
        assertEquals(student.getModules(), new ArrayList<Module>(Arrays.asList(module)));
        student.removeModule("CT401");
        assertEquals(student.getModules(), new ArrayList<Module>());
        //Test Courses
        student.addCourse(course);
        assertEquals(student.getCourses(), new ArrayList<Course>(Arrays.asList(course)));
        student.removeCourse("CS & IT");
        assertEquals(student.getCourses(), new ArrayList<Course>());
    }
    
    @Test public void verifyLecturerDetails() {
    	//Test Name
    	assertEquals("Ann", lecturer.getName());
    	//Test Age
        assertNotNull(lecturer.getAge());
        //Test DoB
        assertEquals(DateTime.parse("1999-09-09"), lecturer.getDob());
        //Test ID
        assertNotNull(lecturer.getId());
        //Test Username
        assertNotNull(lecturer.getUsername());
        //Test Modules
        lecturer.addModule(module);
        assertEquals(lecturer.getModules(), new ArrayList<Module>(Arrays.asList(module)));
        lecturer.removeModule("CT401");
        assertEquals(lecturer.getModules(), new ArrayList<Module>());
    }
    
    @Test public void verifyModuleDetails() {
    	//Test Name
    	assertEquals("Software Engineering III", module.getName());
    	//Test ID
    	assertEquals("CT401", module.getId());
    	//Test Lecturer
    	assertEquals(lecturer, module.getLecturer());
    	//Test Students
    	module.addStudent(student);
        assertEquals(module.getStudents(), new ArrayList<Student>(Arrays.asList(student)));
        module.removeStudent(student.getId());
        assertEquals(module.getStudents(), new ArrayList<Student>());
    	//Test Courses
        module.addCourse(course);
        assertEquals(module.getCourses(), new ArrayList<Course>(Arrays.asList(course)));
        module.removeCourse("CS & IT");
        assertEquals(module.getCourses(), new ArrayList<Course>());
    }
    
    @Test public void verifyCourseDetails() {
    	//Test Name
    	assertEquals("CS & IT", course.getName());
    	//Test Start Date
    	assertEquals(DateTime.parse("2022-09-02"), course.getStartDate());
    	//Test End Date
    	assertEquals(DateTime.parse("2023-05-21"), course.getEndDate());
    	//Test Students
    	course.addStudent(student);
        assertEquals(course.getStudents(), new ArrayList<Student>(Arrays.asList(student)));
        course.removeStudent(student.getId());
        assertEquals(course.getStudents(), new ArrayList<Student>());
    	//Test Modules
        course.addModule(module);
        assertEquals(course.getModules(), new ArrayList<Module>(Arrays.asList(module)));
        course.removeModule("CT401");
        assertEquals(course.getModules(), new ArrayList<Module>());
    }
    
}
