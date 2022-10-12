package Assignment1;

import java.util.ArrayList;

import org.joda.time.DateTime;

public class Lecturer {
	private String name;
	private int age;
	private DateTime dob;
	private String id;
	private String usrname;
	
	private ArrayList<Module> modules = new ArrayList<Module>();
	
	public Lecturer(String name, String id, String dob) {
		this.name = name;
		this.id = id;
		this.dob = DateTime.parse(dob);
		this.age = (int) ((DateTime.now().getMillis() - this.dob.getMillis()) / Long.parseLong("31556952000"));
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void updateAge() {
		age = (int) ((DateTime.now().getMillis() - this.dob.getMillis()) / Long.parseLong("31556952000"));
	}
	
	public DateTime getDob() {
		return dob;
	}
	
	public void setDob(DateTime dob) {
		this.dob = dob;
	}
	
	public String getUsername() {
		usrname = name.concat(String.valueOf(age));
		return usrname;
	}
	
	public String getId(){
//		String temp = String.valueOf(10000 + idadd).substring(1, 4);
//		id = temp.concat(String.valueOf(DateTime.now().getYear()).substring(1, 3));
//		idadd++;
		return id;
	}
	
	public void addModule(Module module) {
		modules.add(module);
		module.setLecturer(this, true);
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
}
