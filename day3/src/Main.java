import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        List<String> input = getStringArray("C:\\Users\\thbot\\Desktop\\Advent of Code\\AOC22\\day3\\input\\input.txt");
        List<String> left = new ArrayList<String>();
        List<String> right = new ArrayList<String>()
        for (String s : input) {
            System.out.println(s);
        }


    }

public static List<String> getStringArray(String path) throws IOException {
    Path path_file = Paths.get(path);
//    byte[] bytes = Files.readAllBytes(path_file);
    return Files.readAllLines(path_file, StandardCharsets.UTF_8);
}


}