package Stack_Example_Using_Array;

public class Person {
	private String name;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Person(String name, String address){
		this.name=name;
		this.address=address;
	}
	
	@Override
	public String toString(){
		return "Name : "+name+ "  Address : "+address;
	}

}


