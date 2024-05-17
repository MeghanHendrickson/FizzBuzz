public class Multiples{
    public static void main(String[] args) {
        System.out.println("Multiples: " + calcMultiples());
    }

    public static int calcMultiples() {
        // int refers to the return type
        int total = 0; // counter

        int i = 1;
        while (i < 1000){
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i); // not needed but nice to see the values
                total += 1;
            }
            i += 1; // increment
        }
        return total;
    }
};