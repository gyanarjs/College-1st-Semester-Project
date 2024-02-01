public class Problem2_ConvertToAnyBase {

    public static void main(String[] args) {
        int decimalNumber = 420;  
        int base = 36;            

        String result = convertToAnyBase(decimalNumber, base);
        System.out.println(decimalNumber + " in base " + base + " is: " + result);
    }

    public static String convertToAnyBase(int n, int b) {
        if (n == 0) {
            return "0";  // Special case for zero
        }

        StringBuilder result = new StringBuilder();
        while (n > 0) {
            int remainder = n % b;
            char digit = (char) (remainder < 10 ? remainder + '0' : remainder - 10 + 'A');
            result.insert(0, digit);
            n /= b;
        }

        return result.toString();
    }
}
