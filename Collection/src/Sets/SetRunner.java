package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {
	public static void main(String[] args) {

		List<Character> characters = List.of('A', 'S', 'P', 'F', 'Z', 'A', 'R', 'Z', 'T');

//		TreeSet:-[A, F, P, R, S, T, Z]
//		HashSet:-[P, A, R, S, T, F, Z]
//		LinkedHashSet:-[A, S, P, F, Z, R, T]
		// unique - Set
		// Tree
		// Hash
		// LinkedHash

		// TreeSet:- removes duplicates and maintains sorting order
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("TreeSet:-" + treeSet);
		// HashSet:-removes duplicates and distribute data randomly
		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("HashSet:-" + hashSet);
		// LinkedHashSet:- removes duplicates and maintains insertion order
		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println("LinkedHashSet:-" + linkedHashSet);

	}

}
