public class zavd1 {
    public static class OurPrimaryClass {
        public static void main(double[] S) {
            double a, b, t, y;

            {
                a = -0.5;
                b = 1.7;
                t = 0.44;
                y = Math.pow(Math.E, -b * t) * Math.sin(a * t + b) - Math.sqrt(Math.abs(b * t + a));
                System.out.println("y=" + y);
            }
        }
    }
}