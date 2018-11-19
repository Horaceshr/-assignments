
public class Pet {

	String pet_type;
	String pet_name;
	
	public Pet() {
		pet_type = "";
		pet_name = "";
	}

	public void setPetType(String s) {
		pet_type = s;
	}
	public void setPetName (String s) {
		pet_name = s;
	}
	public void describeSelf() {
		System.out.println("this pet is a "+pet_type+". It's name is "+pet_name+".");
	}
}
