import java.util.stream.Collectors;

public class AlphabetReplaceClass {
	public String replaceLetterWithPosition(String inputstring){
		String outputstring=String.join(" ",inputstring.toLowerCase().chars().map(x->(int) x -96).mapToObj(x -> String.valueOf(x)).collect(Collectors.toList()));
		return outputstring;
	}
}
