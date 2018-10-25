package palindromenumber;

public class PalindromeNumber {
    public static void main(String[] args) {
        isPalindrome(123789);
        isPalindrome(12321);
        isPalindrome(1234321);
    }

    public static void isPalindrome(int n){

        String nStr = n + "";
        char[] chars = nStr.toCharArray();
        char[] chars2 = new char[chars.length];

        for(int i = 0;i < chars.length;i++){
            chars2[i] = chars[chars.length-1-i];
            System.out.print(chars2[i] + ", ");
        }
        System.out.println();

        if(String.valueOf(chars).equals(String.valueOf(chars2))){
            System.out.print(String.valueOf(chars) + " is palindrome");
        }else{
            System.out.print(String.valueOf(chars) + " is NOT palindrome");
        }
        System.out.println();
    }

}
