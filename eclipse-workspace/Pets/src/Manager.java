
public class Manager {

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("this is the Pets program");
		
		Owner owner_1 = new Owner("george");
		Owner owner_2 = new Owner("Kyra");
		owner_1.introduceSelf();
		owner_2.introduceSelf();
	}
}
