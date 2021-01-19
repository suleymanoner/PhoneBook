
import java.util.HashMap;

public class Person implements Interface{
	public HashMap<String,String> personList;

	
	public Person() {
		this.personList = new HashMap<String,String>();
	}
	
	
	@Override
	public void add(String name, String number) {
		personList.put(name, number);	
	}

}
