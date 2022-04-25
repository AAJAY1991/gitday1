package org.singleton;

public class Test {
	
	static Test object;
	
  public static Test getObject() {
	  
	  if (object==null) {
		  System.out.println("before object:"+ System.identityHashCode(object));
		  
		  object = new Test();
		  System.out.println("after object:"+ System.identityHashCode(object));
		  
		
	}
	  
	return object;
}
    
   private void testOne() {
	System.out.println("test one method");
	
}
  
	public static void main(String[] args) {
		Test object2 = getObject();
		object2.testOne();
		System.out.println(System.identityHashCode(object2));
		
	}	

	}


