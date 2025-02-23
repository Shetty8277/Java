public class Palindrome{
    public static void main(String[] args) {
        int num = 121; // Change this number to test
        int rev = 0, 
        temp = num;

        for (; temp > 0; temp /= 10) {

            rev = rev * 10 + temp % 10;
        }
        if (num == rev ){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a  Palindrome");
        }
        
    }
}
