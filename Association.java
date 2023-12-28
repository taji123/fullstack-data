package association;

import java.util.ArrayList;
import java.util.List;

public class Association {
	public static void main(String[] args) {
		
	
	
	Student student1=new Student("taj","1","eee") ;
	Student student2=new Student("taji","2","it");
    Student student3=new Student("taju","3","ece");
	 
	 List<Student> eee_student=new ArrayList<Student>();
	 eee_student.add(student1);
	 List<Student> it_student=new ArrayList<Student>();
	 it_student.add(student2);
	 List<Student> ece_student=new ArrayList<Student>();
	 ece_student.add(student3);

	 Department ecestudent =new Department("ece",ece_student);
	 
	 Department itstudent =new Department("it",it_student);
	 
	 Department eeestudent =new Department("eee",eee_student);
	 List<Department> Dep1 =new ArrayList<Department> ();
	 
	 Dep1.add(eeestudent);
	
	 Dep1.add(itstudent);
	 Institute institute= new Institute("AATK", Dep1);
	System.out.println( institute.getstudent());
	 
	 

}
}