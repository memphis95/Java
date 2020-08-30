package collections;


import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listCompanies = new ArrayList<String>();
		listCompanies.add("Infosys");
		listCompanies.add("Google");
		listCompanies.add("Microsoft");
		listCompanies.add("Mahindra");
		
		ListIterator<String> iterator = listCompanies.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("accessing the elements in reverse order ");
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
	}

}
