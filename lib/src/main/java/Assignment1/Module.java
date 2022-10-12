package Assignment1;

import java.util.ArrayList;

public class Module {
	
	private String name;
	private String id;
	private Lecturer lecturer;
	
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	public Module(String name, String id, Lecturer lecturer) {
		this.name = name;
		this.id = id;
		this.lecturer = lecturer;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String moduleName) {
		this.name = moduleName;
	}
	
	public void addStudent(Student student) {
		students.add(student);
		student.addModule(this, true);
	}
	
	public void addStudent(Student student, boolean x) {
		students.add(student);
	}
	
	public void removeStudent(String id) {
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getId() == id) {
				students.remove(i);
			}
		}
	}
	
	public ArrayList<Student> getStudents(){
		return students;
	}
	
	public void addCourse(Course course) {
		courses.add(course);
		course.addModule(this, true);
	}
	
	public void addCourse(Course course, boolean x) {
		courses.add(course);
	}
	
	public void removeCourse(String id) {
		for(int i = 0; i < courses.size(); i++) {
			if(courses.get(i).getName() == id) {
				courses.remove(i);
			}
		}
	}
	
	public ArrayList<Course> getCourses(){
		return courses;
	}
	
	public Lecturer getLecturer() {
		return lecturer;
	}
	
	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
		lecturer.addModule(this, true);
	}
	
	public void setLecturer(Lecturer lecturer, boolean x) {
		this.lecturer = lecturer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
