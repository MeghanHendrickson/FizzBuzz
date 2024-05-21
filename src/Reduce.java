public class Reduce {
    public static void main(String[] args) {
        int value = 100;
        int steps = 0;
        while (value > 0){
            value /= 2;
            steps += 1;
        }
        System.out.println(steps);
    }
}
