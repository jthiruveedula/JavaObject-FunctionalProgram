package filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadRunner {
	public static void main(String[] args) throws IOException {

		Path filepath = Paths.get("./files/test.txt");

		Files.lines(filepath).filter(str -> str.contains("jagadeesh"))
				.forEach(System.out::println);

	}
}
