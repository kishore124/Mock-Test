package in.ineuron;

class Person {
	private String name;
	private String address;
	private Integer age;

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}

public class Question_3 {

	public static void main(String[] args) {

		Person person = new Person();
		person.setName("Sachin");
		person.setAge(49);
		person.setAddress("MI");

		System.out.println("Person name is " + person.getName());
		System.out.println("Person age is  " + person.getAge());
		System.out.println("Person Address is " + person.getAddress());
	}

}
