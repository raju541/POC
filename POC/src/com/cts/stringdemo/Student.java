package com.cts.stringdemo;

public class Student {
	
		int id;
		String name;
		public Student() {}
		public Student(int id,String name) {
			this.id=id;
			this.name=name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		 @Override
		    public boolean equals(Object obj) 
		    { 
		          
		    // checking if both the object references are  
		    // referring to the same object. 
		    if(this == obj) 
		            return true; 
		          
		        // it checks if the argument is of the  
		        // type Geek by comparing the classes  
		        // of the passed argument and this object. 
		        // if(!(obj instanceof Geek)) return false; ---> avoid. 
		        if(obj == null || obj.getClass()!= this.getClass()) 
		            return false; 
		          
		        // type casting of the argument.  
		        Student geek = (Student) obj; 
		          
		        // comparing the state of argument with  
		        // the state of 'this' Object. 
		        return (geek.name == this.name && geek.id == this.id); 
		    } 
		 
		 @Override
		    public int hashCode() 
		    { 
		          
		        // We are returning the Geek_id  
		        // as a hashcode value. 
		        // we can also return some  
		        // other calculated value or may 
		        // be memory address of the  
		        // Object on which it is invoked.  
		        // it depends on how you implement  
		        // hashCode() method. 
		        return this.id; 
		    } 
		      		

}
