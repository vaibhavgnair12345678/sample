package sample;

public class fiboniccisequence {

    public static void main(String[] args) {
        int n = 10; // number of terms to display
        int first = 0, second = 1, next;

        System.out.println("Fibonacci sequence up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.println(first);
            next = first + second;
            first = second;
            second = next;
        }
    }
}
