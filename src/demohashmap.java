import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class demohashmap {

	public static void main(String[] args) {

	HashMap<String,Integer>citymap=new HashMap<>();
	citymap.put("Dallas",21);
	citymap.put("Houston",22);
	citymap.put("Austin ",23);
	citymap.put("CollegeStation",24);

	 
	for(Map.Entry<String , Integer>entry :citymap.entrySet())
	{
	 System.out.println("Key: " + entry.getKey() + ", Value: " +entry.getValue());


	}
for(String Key:citymap.keySet())
{
	System.out.println("---------------------------------------------------");
    System.out.println("Key: " + Key + ", Value: " + citymap.get(Key));

}
}
}
