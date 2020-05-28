import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		String[] colours = {"RED", "YELLOW", "BLACK"};
		List<String> list = new ArrayList<String>(); // type inferencing from our diamond notation

		
		for (String colour: colours) {
			list.add(colour);
		}
		
	//we can also use .remove and do the same enhanced for statement
		
		System.out.println("ArrayList: ");
		
		for(int count = 0; count < list.size(); count++) { //recall arrays and .length() 
			System.out.printf("%s ", list.get(count)); //we also use zero based counting, note count < not count<=
		}
		
		String[] removeColours = {"BLACK", "ORANGE"};
		List<String> removeList = new ArrayList<String>();
		
		for (String removeColour: removeColours) {
			list.add(removeColour);
		}
		
		removeColours(list,removeList);
		
		System.out.printf("%nList after calling remove colours method ");
		
		for (String colour: list) {
			System.out.printf("%s ", colour);
		}

	}
	
	private static void removeColours(Collection<String> collection, 
			Collection<String> secondCollection) {
		Iterator<String> iterator = collection.iterator();
		
		while(iterator.hasNext()) {
			if(secondCollection.contains(iterator.next())) {
				iterator.remove();
			}
		}
		
	}

}
