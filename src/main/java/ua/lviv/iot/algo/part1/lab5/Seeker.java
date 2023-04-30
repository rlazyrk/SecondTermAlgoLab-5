package ua.lviv.iot.algo.part1.lab5;



import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public final class Seeker {
    private Pattern pattern;
    public String findAllWithWord(final String toSearch, final String word) {
        pattern = Pattern.compile(word + "(.jpg|.png|.jpeg|.gif)");
        Matcher matcher = pattern.matcher(toSearch);
        String output = "";
        while (matcher.find()) {
            output = output + matcher.group() + " ";
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String word = scanner.nextLine();
        Seeker seeker = new Seeker();
        System.out.println(seeker.findAllWithWord(text,word));
    }

}
