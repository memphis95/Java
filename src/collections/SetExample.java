package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> numberSet = new LinkedHashSet<>();
		numberSet.add(12);
		numberSet.add(24);
		numberSet.add(12);
		System.out.println(numberSet);

	}

}
