/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    // main method indicates to Java to run this file
    public static void main(String[] args) {
        doFizzBuzz();
    }

    // key word private (public on main) instead of _leadingUnderscore
    private static void doFizzBuzz() {
        int i = 1;
        while (i < 100) {

            // Find out which numbers divide i.
            // Java requires type documentation
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
            i += 1;
        }
    }
}
