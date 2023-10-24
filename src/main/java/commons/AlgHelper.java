package commons;

public class AlgHelper {
    private AlgHelper() {
    }

    public static double f(double a, double b, double T[]) {
        double sum = 0;
        for (double x : T) {
            if (x >= a && x <= b) {
                sum += x;
            }
        }

        return sum;
    }
}