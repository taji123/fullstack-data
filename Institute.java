package association;

import java.util.ArrayList;
import java.util.List;

public class Institute {
	String InstName;
	List<Department> departmentlist;
	 public Institute(String InstName,List<Department> departmentlist) {
		 this.InstName=InstName;
		 this.departmentlist=departmentlist;
	 }
		 
		public List<Department> getstudent(){
			return departmentlist;
		}
		
		 
		 
		 
		 
	 }
	


