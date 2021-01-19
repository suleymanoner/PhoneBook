
import java.util.HashMap;

public class Numbers implements Interface{
	public HashMap<String,String> numberList;
	

	public Numbers() {
		this.numberList = new HashMap<String,String>();
	}
	

	@Override
	public void add(String number, String name) {
		numberList.put(number, name);
	}

}
