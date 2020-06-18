package Basics;

public class Strings {
//STRING API
	public static void main(String[] args) {
		String book_title = "LOR";
		String word_choice = "R";
		
		
		if (book_title.contains(word_choice)) {
			System.out.println("Book contais ring or R");
		}
		
		String browser = "Chrome";
		
		if(browser.equalsIgnoreCase("chRome")) {
			System.out.println("Chrome is the browser");
		} 
		
		String firstname = "Tim";
		String lastname = "Short";
		String SSN = "1234ASDFG78645";
		
		//PRINT THE FIRST INITIALS + LAST 4 DIGS OF THE SSN
		System.out.println(firstname.substring(0, 1));
		System.out.println(lastname.substring(0, 1));
		System.out.println(SSN.substring(9, 13));
		
		//LENGTH OF THE STRING
		System.out.println("The length of the characters in SSN are: " + SSN.length());
		
	}

}
