package unidad6.valid_palindrome;

public class NotPalindromeException extends Exception {
    public NotPalindromeException() {
        super("Not a palindrome");
    }
}
