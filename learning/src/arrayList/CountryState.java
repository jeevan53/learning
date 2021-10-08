package arrayList;
import java.util.HashMap;
import java.util.Set;


public class CountryState {

	
	public static void main(String [] args) {
		
		HashMap<String, String>  countryStates = new HashMap<>();
		
	    // 
		
		Set<String> keys = countryStates.keySet();
		
		HashMap<String, Integer> mapCount = new HashMap<>();
		
		for (String key : keys) {
			Integer count = mapCount.get(key);
			if ( count == null ) {
				count = 1;
			} else {
				count = count + 1;
			}
			mapCount.put(key, count);
		}
		
		Set<String> countKeys = mapCount.keySet();
		
		for (String countKey : countKeys) {
			System.out.print("Country count "  +countKey +  mapCount.get(countKey));
		}
		
	}
}
