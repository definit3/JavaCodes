import java.util.HashMap;

public class MainHashmap {
	public static void main(String[] args) {
		HashMap<String,String> x = new HashMap<String, String>();
		x.put("HY", "Hyderabad");
		x.put("PY", "Patna");
		x.put("DL", "Delhi");
		
		for(String i:x.keySet())System.out.println(i);
		for(String i:x.values())System.out.println(i);
		
		String city=x.get("HY");
		System.out.println(city);
		x.remove("HY");
		System.out.println(x.containsKey("HY"));
	}
}
