import java.util.ArrayList;

public class Owner {

	String my_name;
	ArrayList<Pet> my_pets;
	
	public Owner() {
		my_name = "unknown";
	}
	
	public Owner(String name) {
		my_name = name;
		my_pets = new ArrayList<Pet>();
	}
	
	public void introduceSelf() {
		System.out.println("my name is "+my_name);
		System.out.println("I have "+my_pets.size()+" pets");
	}
	public void addPet(String type, String name) {
		Pet p = new Pet();
		p.setPetName("Shasta");
		p.setPetType("Golden Retriever");
		my_pets.add(p);
	}
	public void describePets() {
		// add for loop here
	}
	
}
