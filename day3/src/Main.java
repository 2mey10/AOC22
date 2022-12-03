import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        List<String> input = getStringArray("C:\\Users\\thbot\\Desktop\\Advent of Code\\AOC22\\day3\\input\\input.txt");
        int sum = 0;
        for (String s : input) {
            String leftString = s.substring(0,s.length()/2);
            String rightString = s.substring(s.length()/2);
            char dupe = getDuplicateCharacter(leftString,rightString);
            sum += getScoreValue(dupe);
        }
        System.out.println("Sum of all priorities (1) is: " + sum);

        int sum2 = 0;

        for (int i = 0;i<input.size();i++) {
            if (i % 3 == 2){
                String stringOne = input.get(i-2);
                String stringTwo = input.get(i-1);
                String stringThree = input.get(i);
                char tripleChar = getTriplicateCharacter(stringOne,stringTwo,stringThree);
                sum2 += getScoreValue(tripleChar);
            }

        }
        System.out.println("Sum of all priorities (2) is: " + sum2);
    }

public static List<String> getStringArray(String path) throws IOException {
    Path path_file = Paths.get(path);
    return Files.readAllLines(path_file, StandardCharsets.UTF_8);
}

public static char getDuplicateCharacter(String left, String right){
        for (char cL: left.toCharArray()){
            for (char cR: right.toCharArray()){
                if ( cL==cR){
                    return cL;
                }
            }
        }
    return 0;
}

public static char getTriplicateCharacter(String one, String two, String three){
    for (char c1: one.toCharArray()){
        for (char c2: two.toCharArray()){
            if ( c1==c2){
                for (char c3: three.toCharArray()){
                    if (c1==c3)
                        return c1;
                }
            }
        }
    }
    return 0;
}

public static int getScoreValue(char charInput){
    char[] alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    int counter = 1;
    for (char charAlphabet: alphabet){
        if (charAlphabet == charInput)
            return counter;

        counter += 1;
    }
    return counter;
}

}