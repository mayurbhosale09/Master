package new_tries_java_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccuranceOfaString {

	public static void main(String[] args) {

		duplicateCharacters("Ayashaaaaaaaaa Bodele is a girl");	
		duplicateCharacters("kakatua parrot is a bird");
		duplicateCharacters("John was jealous");
		duplicateCharacters("rats");
	}


	private static void duplicateCharacters(String name) {
		name = name.replace(" ","");
		char ch[] =name.toCharArray();

		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(char ch1 : ch) {
			if(map.containsKey(ch1)) {
				map.put(ch1,(Integer) map.get(ch1)+1);
			}else {
				map.put(ch1, 1);
			}
		}

	
		Set<Entry<Character,Integer>> entryset =map.entrySet();
		for(Entry<Character,Integer> entry : entryset) {

			if(entry.getValue()>1) {
				System.out.println(entry.getKey() +" found "+ entry.getValue()+" times ");

			}

		}

		System.out.println("===========End of List===============");
	}

}
