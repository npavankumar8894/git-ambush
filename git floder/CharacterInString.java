package com.java;

public class CharacterInString {

	public static void main(String[] args) {

		String name ="pavan";
		char givencharacter ='p';
		int count=0;
		for(int i=0; i<name.length();i++) {

			if(name.charAt(i)==givencharacter) {
				count++;


			}

		}
		System.out.println(" The given character is repeating for "+count+" times ");
	}

}
