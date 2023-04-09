package p1; 
//Encapsulation
public class A { 
	private int id; //non static
	//Below method is "setter"
	public void setId(int id) { // here "id" is local variable 
		this.id = id; //with "this" we accessed non static member.
		// so nonstaticId = localId although variables are same
	}
		//Below method is "Getter"
	private int getId() { //because void methods can't return value
		return id;
	}
}
//now we'll set & get id value in different class

	
