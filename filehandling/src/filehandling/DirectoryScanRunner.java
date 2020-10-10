package filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {
	public static void main(String[] args) throws IOException {

//		Files.list(Paths.get(".")).forEach(System.out::println);
		Path currentdir = Paths.get(".");

		Predicate<? super Path> predicate
		=path -> String.valueOf(path).contains(".java");
		
		Files.walk(currentdir, 4).filter(predicate).forEach(System.out::println);

		BiPredicate<Path, BasicFileAttributes> matcher = (path, attributes) -> attributes.isDirectory();

		Files.find(currentdir, 4, matcher).forEach(System.out::println);
	}

}
