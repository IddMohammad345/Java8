package Chars_Practice;

public class CheckingCharactersProperties {
    public static void main(String[] args) {
        char ch='8';
        //checking the character is digit
        if (Character.isDigit(ch)){
            System.out.println(ch +" is a digit");
        }
        //checking the character is Letter
        char letter='A';
        if (Character.isLetter(letter)){
            System.out.println(letter +" is a letter");
        }
        //checking the character is space
        char space=' ';
        if (Character.isSpaceChar(space)){
            System.out.println(space+ " is a space");
        }

    }
}
