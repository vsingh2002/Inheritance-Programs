package Hierarchical;

 class Solution
 {
	 public static void main(String[] args)
	 {
		 Student s=new Student();
		 System.out.println("Name:"+s.name);
		 System.out.println("Marks :"+s.marks);
		 s.study();
		 System.out.println("       ");
		 Employee e=new Employee();
		 System.out.println("Name :"+e.name);
		 System.out.println("Salary :"+e.salary);
		 e.work();
		 
		
	}

 }
