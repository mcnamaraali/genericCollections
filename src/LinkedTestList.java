import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;

public class LinkedTestList {

	public static void main(String[] args) {
		
		String[] firstColoursStringArray = {"green", "white", "orange", "black", "yellow", "red"};
		List<String> list1 = new LinkedList<>();
		
		for (String firstForEachColours: firstColoursStringArray) {	
			list1.add(firstForEachColours);
		}
		
		String[] secondColoursStringArray = {"blue", "white", "red", "green", "white", "red"};
		List<String> list2 = new LinkedList<>();
		
		for (String secondForEachColours: secondColoursStringArray) { //iterates through each string array item 
			//and stores it in coloursSecondFor
			list2.add(secondForEachColours);
			//adds all of the colours string to list1
		}
		
		list1.addAll(list2);
		list2 = null;
		printList(list1);
		
		System.out.println("Time to delete items");
		removeItems(list1, 4, 7);
		printList(list1);
		
		System.out.println("Reverse the list");
		printReversedList(list1);


	}
	
	private static void printList(List<String> list) {
		for (String thirdForEachColours: list) {
			System.out.println(thirdForEachColours);
		}
		System.out.println();
	}
	
	private static void removeItems(List<String> list, int start, int end) {
		list.subList(start, end).clear(); //remove items and remember these are the indices 
		//subList is a range-view method , so it allows you to view a portion of the list
	}
	
	private static void printReversedList(List<String> list) {
		ListIterator<String> iterator = list.listIterator(list.size());
		
		int size = list.size();
		System.out.printf("Size of the list %d%n", size);
		
		while(iterator.hasPrevious()) {
			System.out.printf("%s ", iterator.previous());
		}
		
	}
	

}
