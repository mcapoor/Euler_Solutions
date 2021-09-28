public class Solution {

    public static long findLargestFactors(long number) {
        long largestFactor = 0L;
        for (long i = (long) Math.sqrt(number); i >= 0; i--) {
            if ((i % 2 != 0) & (i % 5 != 0)) {
                if (number % i == 0) {
                    largestFactor = i;
                }
            }
        }
        return largestFactor;
    }
    public static boolean checkPrime(long number) {
        for (int x = 2; x*x <= number; x++){
            if(number % x == 0) {
                return false;
            }
        }
        return true;
    }
        
    public static void main(String[] args) {
        System.out.println(checkPrime(findLargestFactors(600851475143L)));
    }
}