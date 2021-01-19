
import java.util.HashMap;

public class Address implements Interface{
	public HashMap<String, String> addressList;
	
	
	public Address() {
		this.addressList = new HashMap<String,String>();
	}

	
	@Override
	public void add(String name,String address) {
		addressList.put(name, address);
	}

}
