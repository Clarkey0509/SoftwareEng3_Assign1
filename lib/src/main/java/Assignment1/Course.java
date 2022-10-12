package Assignment1;

import java.util.ArrayList;

import org.joda.time.DateTime;

public class Course {
	private String name;
	private DateTime startDate;
	private DateTime endDate;
	
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Module> modules = new ArrayList<Module>();
	
	public Course(String name, String start, String end) {
		this.setName(name);
		this.setStartDate(DateTime.parse(start));
		this.setEndDate(DateTime.parse(end));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	
	public void addModule(Module module) {
		modules.add(module);
		module.addCourse(this, true);
	}
	
	public void addModule(Module module, boolean x) {
		modules.add(module);
	}
	
	public void removeModule(String id) {
		for(int i = 0; i < modules.size(); i++) {
			if(modules.get(i).getId() == id) {
				modules.remove(i);
			}
		}
	}
	
	public ArrayList<Module> getModules(){
		return modules;
	}
	
	public void addStudent(Student student) {
		students.add(student);
		student.addCourse(this, true);
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
}
