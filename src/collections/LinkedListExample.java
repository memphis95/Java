package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> listCompanies = new LinkedList<String>();
		listCompanies.add("Infosys");
		listCompanies.add("Mahindra");
		listCompanies.add("google");
		listCompanies.add("Microsoft");
		
		for(int index =0; index<listCompanies.size();index++) {
			System.out.println(listCompanies.get(index));
		}
		listCompanies.removeFirst();
		listCompanies.removeLast();
		for(String str:listCompanies) {
			System.out.println(str);
		}
		
		listCompanies.addFirst("hello");
		listCompanies.addLast("World");
		ListIterator<String> iterator = listCompanies.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
				

	}

}
