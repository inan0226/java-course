package Q1;

public class Main2 {
    public static void main() {
        int x = 10;
        int y = 20;

        boolean isGreater = x > y;
        boolean isSmaller = x < y;
        boolean isEqual = x == y;
        boolean isNotEqual = x != y;

        System.out.println("x가 y보다 큰가? " + isGreater);
        System.out.println("x가 y보다 작은가? " + isSmaller);
        System.out.println("x가 y보다 같은가? " + isEqual);
        System.out.println("x가 y보다 다른가? " + isNotEqual);
    }
}
