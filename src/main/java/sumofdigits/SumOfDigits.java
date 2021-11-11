package sumofdigits;

public class SumOfDigits {

    int getSumOfDigits (int number) {
        int sumOfDigits = 0;
        String numberString = Integer.toString(number);
        for (int i = 0; i < numberString.length(); i++) {
            sumOfDigits += Integer.parseInt(numberString.substring(i, i+1));
        }
        return sumOfDigits;
    }
}
