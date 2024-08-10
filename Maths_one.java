// Fibonacci Series in Java
public class Maths_one {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, i, count = 10;

        System.out.println(n1 + " " + n2);//printing 0 and 1
        System.out.println("Fibonacci Series in Java");
        for (i = 2; i < count; i++) { // loop statrt from 2 because 0 and 1 are already printed
            n3 = n1 + n2; // 1
            n1 = n2;    // n1 -->1 / 1 / 2 / 3 / 5
            n2 = n3;    // n2 -->1 / 2 / 3 / 5 / 8

            System.out.println("" + n3);
        }
    }
}