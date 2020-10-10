package functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateClass {
	public static void main(String[] args) {
		
		Predicate<? super Integer> evenPredicate = createPredicate();
		Predicate<? super Integer> oddPredicate = n -> n % 2 != 0;

//		List.of(1, 2, 5, 4, 64, 23, 744, 23, 478).stream().filter(e -> e % 2 == 0)
//				.forEach(e -> System.out.println(e));

		// Stream<T> filter(Predicate<? super T> predicate);
		// boolean test(T t);

//		List.of(1, 2, 5, 4, 64, 23, 744, 23, 478).stream().filter(new EvenNumberPredicate())
//				.forEach(e -> System.out.println(e));

		// checking forEach Interface
		// void forEach(Consumer<? super T> action);
		// void accept(T t);

//		List.of(1, 2, 5, 4, 64, 23, 744, 23, 478).stream().filter(new EvenNumberPredicate()).map(new MapBehindScene())
//				.forEach(new ForEachConsumer());

		List.of(1, 2, 5, 4, 64, 23, 744, 23, 478).stream().filter(evenPredicate).map(new MapBehindScene())
				.forEach(new ForEachConsumer());


		// Map Function behind the scene
		// <R> Stream<R> map(Function<? super T, ? extends R> mapper);
		// int applyAsInt(int operand);

	}

	private static Predicate<? super Integer> createPredicate() {
		return n -> n % 2 == 0;
	}
}

//Map function behind the scene
class MapBehindScene implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer t) {
		// TODO Auto-generated method stub
		return t * t;
	}

}
//behind forEach function 
class ForEachConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println(t);

	}

}

//Behind Filter method in functional 
class EvenNumberPredicate implements Predicate<Integer> {
@Override
public boolean test(Integer num) {
	return num % 2 == 0;
}
}
