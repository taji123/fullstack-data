package association;

import java.util.List;

public class Department {
	String deptName;
	List<Student> student;
	 public Department(String deptName,List<Student> student) {
		 this.deptName=deptName;
		 this.student=student;
	 }
		 public List<Student> getstudent() {
			 return student;
			 
		 }
	 }
	


