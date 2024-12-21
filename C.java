public class C {
    static class Point {
        private int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void SetX(int x) {
            this.x = x;
        }
        public int GetX() {
            return x;
        }
        public void SetY(int y) {
            this.y = y;
        }
        public int GetY() {
            return y;
        }
        public String toString() {
            return String.format("x: %d, y: %d", x, y);
        }
    }
    public static void main(String[] args) {
        Point p1 = new Point(3, -5), p2 = new Point(10, 4);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
