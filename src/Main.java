public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the digit in number  125 is "+sumDigit(125));
        System.out.println("The sum of the digit in number  -1 is "+sumDigit(-1));
        System.out.println("The sum of the digit in number  5 is "+sumDigit(5));
        System.out.println("The sum of the digit in number 123456 is "+sumDigit(123456));
    }

    public static int sumDigit(int number) {
        if(number < 10) {
            return -1;
        }

        int sum = 0;
        //125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
         while (number > 0) {
             //extract the lest-significant digit
             int digit=number % 10;
             sum += digit;

             //drop the least-significant digit
             number /= 10;  // or number = number / 10;
         }
         return sum;
    }
}
