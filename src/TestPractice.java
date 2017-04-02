import static org.junit.Assert.*;

import org.junit.Test;

public class TestPractice {
	String answer="";
	String answer2="";
	String answer3="";
	int x;
	int x2;
	char letter;
	int length; 
	int length2;
	String newT="";
	@Test
	public void test1() {
		assertEquals("wpaafnfclaekses", weaveStrings("waffles", "pancakes"));
	}
	@Test
	public void test2() {
		assertEquals("Mntvrst",removeVowels("MountEverest"));
	}
	@Test
	public void test3() {
		assertEquals("toboRtoboR",reverseRepeat("Robot"));
	}

	private String reverseRepeat(String preReverse) {
		for (int i = 0; i < 2; i++) {
		length=preReverse.length();
		length2=length-1;
		for (int j = 0; j < length; j++) {
			newT=newT+preReverse.charAt(length2);
			length2-=1;
		}
		}
		return newT;
	}
	private Object removeVowels(String word) {
		for (int i = 0; i < word.length(); i++) {
			letter=word.charAt(i);
			if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U') {
			}
			else{
				answer2+=letter;
			}
		}
		return answer2;
	}
	String weaveStrings(String input, String input2) {
		if (input.length() > input2.length()) {
			for (int i = 0; i < input2.length(); i++) {
				answer += input.charAt(i);
				answer += input2.charAt(i);
			}
			x=input.length()-input2.length();
			for (int i = 0; i < x; i++) {
				x2=x;
				answer += input.charAt(input.length()-x2);
				x2--;
			}
		}
		if (input.length() < input2.length()) {
			for (int i = 0; i < input.length(); i++) {
				answer += input.charAt(i);
				answer += input2.charAt(i);
			}
			x=input2.length()-input.length();
			for (int i = 0; i < x; i++) {
				x2=x;
				answer += input2.charAt(input2.length()-x2);
				x2--;
			}
		}
		if (input.length() > input2.length()) {
			for (int i = 1; i < input2.length() + 1; i++) {
				answer += input.charAt(i);
				answer += input2.charAt(i);
			}
			x=input.length()-input2.length();
			for (int i = 0; i < x; i++) {
				x2=x;
				answer += input.charAt(input.length()-x2);
				x2--;
			}
		}
		return answer;
	}
}
