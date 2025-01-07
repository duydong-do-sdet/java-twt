package tutorial;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class J_09_Set_List {

	public static void main(String[] args) {
		// HashSet
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(13);
		hs.add(10);
		hs.add(97);

		System.out.println(hs);
		System.out.println(hs.contains(10));
		System.out.println(hs.size());

		hs.remove(97);

		System.out.println(hs);
		System.out.println(hs.contains(97));
		System.out.println(hs.isEmpty());

		hs.clear();

		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());

		// TreeSet
		Set<Integer> ts = new TreeSet<Integer>();
		ts.add(13);
		ts.add(10);
		ts.add(97);

		System.out.println(ts);

		// ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(13);
		al.add(10);
		al.add(97);
		al.add(14);
		al.add(7);
		al.set(2, 23);

		System.out.println(al);
		System.out.println(al.subList(1, 4));
	}

}
