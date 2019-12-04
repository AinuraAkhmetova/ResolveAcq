public class Main {

    public static void main(String[] args) {
        ResolveAcq(3, -14, -5);
    }

    public static void ResolveAcq(float a, float b, float c) {
        float D, x1, x2;
        D = (float) Math.pow(b, 2) - 4 * a * c;
        if (D < 0) System.out.println("D =" + D + " <0, корней нет.");
        else {
            x1 = (-b + (float) Math.sqrt(D)) / (2 * a);
            x2 = (-b - (float) Math.sqrt(D)) / (2 * a);
            System.out.println("Корни: х1=" + x1 + "; х2=" + x2 + ".");
        }

    }
}
