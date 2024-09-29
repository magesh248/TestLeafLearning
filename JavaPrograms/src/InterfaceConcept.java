
 interface shapes {
	
	int i=10;
	int j=20;
	
	void circle();
	
	}

 public class InterfaceConcept implements shapes{
	
	public void circle() {
		System.out.println("interface method is implemented");
		
	}
	
	
	public static void main(String[] args) {
		
		
		InterfaceConcept obj =new InterfaceConcept();
		
		obj.circle();
		
	System.out.println(shapes.i * shapes.j);	
		
	}

}
