importjava.util.*;
importacm.program.*;
/*puts a list of names in a hashmap then prints out instances of each name*/

public class NumberOfTimesEachName extendsConsoleProgram {
	publicvoidrun() {
		HashMap<String,Integer> nameMap = newHashMap<String,Integer>();
		readNames(nameMap);
		printMap(nameMap);
		}
	/** Reads a list of names from the user, storing names and how many* times each appeared in the map that is passed in as a parameter.*/
	privatevoidreadNames(Map<String,Integer> map) {
		
		while(true) {
			String name = readLine("Enter name: ");
				if(name.equals("")) break;
			// See if that name previously appeared in the map.  Update
			// count if it did, or create a new count if it didn't.
				Integer count = map.get(name);
				if(count == null) {count = newInteger(1);
			} 
				else{
				count = newInteger(count + 1);
				}
			map.put(name, count);
			}
		}
	/** Prints out list of entries (and associated counts) from the map* that is passed in as a parameter.*/
	privatevoidprintMap(Map<String,Integer> map) {
		
		Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				intcount = map.get(key);
				println("Entry [" + key + "] has count " + count);}
		}
	} 
}
