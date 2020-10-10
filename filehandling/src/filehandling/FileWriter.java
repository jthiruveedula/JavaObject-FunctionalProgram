package filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriter {
	public static void main(String[] args) throws IOException {

		Path filepath = Paths.get("./files/write.txt");

		List<String> list = List.of("Apple", "Ball", "Cat", "Dog", "Elephant");

		Files.write(filepath, list);

	}
}
