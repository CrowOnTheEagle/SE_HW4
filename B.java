public class B {
    static class Calculate {
        static int Sum(int a, int b) {
            return a + b;
        }
        static int Subtract(int a, int b) {
            return a - b;
        }
        static int Absolute(int a) {
            return a > 0 ? a : -a;
        }
        static int Multiply(int a, int b) {
            return a * b;
        }
    }
    public static void main(String[] args) {
        int a = 3, b = -5;
        System.out.println(Calculate.Sum(a, b));
        System.out.println(Calculate.Subtract(a, b));
        System.out.println(Calculate.Absolute(b));
    }
}
