import java.util.ArrayList;

public class collection {
	
	ArrayList<String> my_collection;
	int pointer;
	
	// constructor
	public collection() {
		pointer=0;		my_collection=new ArrayList<String>();
	}
	
	public boolean hasNext() {
		if (pointer < my_collection.size()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void additem(String s_to_add) {
		my_collection.add(s_to_add);
	}
	
	public String getnext() {
		String toreturn = my_collection.get(pointer);
		pointer++;
		return toreturn;
	}

		
	//
}
