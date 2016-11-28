package topic04.chapter10;

public class E22 {
/*
(Implement the String class) The String class is provided in the Java library.
Provide your own implementation for the following methods (name the new
class MyString1):
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array of characters
		char[] array = {'B','u','b','b','l','e','s'};
		
		// Object
		MyString1 str = new MyString1(array);
		
		// Displays character at index 3
		System.out.println("The character at index 3 is " + str.CharAt(3));
		
		// Displays the length
		System.out.println("The length of MyString1 object is " + str.length());
		
		// Displays a substring of MyString1
		System.out.print("A substring of str is ");
		MyString1 substring1 = str.substring(0, 6);
		for (int i = 0; i < substring1.length(); i++)
			System.out.print(substring1.CharAt(i));
		
		// Displays a new string with lower case
		System.out.print("\nThe string in lower case is ");
		MyString1 str2 = str.toLowerCase();
		for (int i = 0; i < str2.length(); i++)
			System.out.print(str2.CharAt(i));
		
		// Make something to compare
		char[] array2 = {'I','l','o','v','e','d','o','g','s'};
		MyString1 str3 = new MyString1(array2);
		
		// Displays if strings are the same
		System.out.print("\nThe strings are the same = " + str.equals(str3));
	}

}
class MyString1 {
	private char [] chars;
	
	// Constructor
	public MyString1(char[] chars){
		this.chars = new char[chars.length];
		for (int i = 0; i < chars.length; i++)
			this.chars[i] = chars[i];
	}
	
	// Method to return char at a certain index
	public char CharAt(int index){
	return chars[index];
	}
	// Returns length
	public int length(){
		return chars.length;
	}
	// Returns a substring
	public MyString1 substring (int begin, int end){
		char[] ch = new char [end - begin];
		for (int i = begin, j = 0; i < end; i++, j++)
			ch[j] = chars[i];
		return new MyString1(ch);
	}
	// Returns a new string with lowercase letters
	public MyString1 toLowerCase(){
		char[] ch = new char[chars.length];
		for (int i = 0; i < chars.length; i++){
			if (chars[i] >= 'A' && chars[i] <= 'Z')
				ch[i] = (char)(chars[i] + 32);
			else
				ch[i] = chars[i];
		}
		return new MyString1(ch);
	}
	// Returns true if strings are the same and false if not
	public boolean equals(MyString1 s){
		if (chars.length != s.length())
			return false;
		for (int i = 0; i < chars.length; i++){
			if (chars[i] != s.CharAt(i))
				return false;
		}
		return true;
	}
	/* I am unsure what to do with this
	public static MyString1 valueOf(int i){
	}*/
}